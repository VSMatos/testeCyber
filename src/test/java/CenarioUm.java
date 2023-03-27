

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CenarioUm {

    public WebDriver driver;
    //public WebDriverWait wait;

    @Before
    public void setupAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //wait = new WebDriverWait((WebDriver) wait,5);
    }


    @After
    public void fecharNavegador() {
        //driver.quit();
    }

    private void clicarNoIdioma(String idioma) {
        driver.findElement(By.linkText(idioma)).click();
    }

    @Test
    public void testeDsl(){

        dsl.escrever(caminho, "Nome");
    }

    @Test
    public void test() {
        driver.get("https://demo.automationtesting.in/");
        Assert.assertEquals("Index", driver.getTitle()); // verificar titulo inicial
        driver.manage().window().setSize(new Dimension(1381, 742));

        //driver.manage().window().maximize(); // abrir a janela maximizada

        //clicar img resister
        driver.findElement(By.id("enterimg")).click();
        // verificar se o titulo é o esperado
        Assert.assertEquals("Register", driver.getTitle());

        //insercao de nome usando xpath
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).click();
        driver.findElement(By.xpath("//*['@id=basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Name");
        //validacao do nome inserido
        Assert.assertEquals("Name", driver.findElement(By.xpath("//*['@id=basicBootstrapForm']/div[1]/div[1]/input")).getAttribute("value"));

        //insercao de sobrenome usando CSS selector
        driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")).click();
        driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")).sendKeys("SecondName");
        //validar sobrenome
        Assert.assertEquals("SecondName", driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")).getAttribute("value"));

        // insercao de endereco utilizando full xpath
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).click();
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Rua da rua, Bairro: Centro - Cidade - Brasil");
        //validar se endereco foi inserido
        Assert.assertEquals("Rua da rua, Bairro: Centro - Cidade - Brasil", driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).getAttribute("value"));


        driver.findElement(By.xpath("//*[@id='eid']/input")).click();
        driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys("email@email");
        //validando e-mail inserido  ***** necessita melhora na validacao de caracteres
        Assert.assertEquals("email@email", driver.findElement(By.xpath("//*[@id='eid']/input")).getAttribute("value"));

        //Criando variavel para facilitacao de leitura do codigo
        WebElement telField = driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"));
        telField.click();
        telField.sendKeys("1234567890");
        //validando o numero de telefone e se possui 10 caracteres
        Assert.assertEquals("O tamanho eseperado é de 10 caracteres",10,telField.getAttribute("value").length());

        //clicando no gender
        driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(1) > input")).click();
        //conferindo se a check-box foi clicada
        Assert.assertTrue(driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(1) > input")).isSelected());

        driver.findElement(By.id("checkbox2")).click();
        Assert.assertTrue(driver.findElement(By.id("checkbox2")).isSelected());

        WebElement languageField = driver.findElement(By.id("msdd"));

        languageField.click();
        //criada uma function para facilitar leitura e escrita do codigo (repeticao -- podendo adicionar spread operator)
        clicarNoIdioma("Portuguese");
        clicarNoIdioma("English");
        clicarNoIdioma("Spanish");

        //click para fechar o campo de idimoas id=mdss que ficava aberto impedindo click em outro elemento
        driver.findElement(By.xpath("//*[@id='eid']/input")).click();


        driver.findElement(By.id("Skills"));

        WebElement listaSkills = driver.findElement(By.id("Skills"));
        listaSkills.findElement(By.xpath("//option[. = 'Javascript']")).click();

        Assert.assertEquals("Javascript", listaSkills.getAttribute("value"));

        //driver.findElement(By.id("countries")); //erro no campo, sem opcoes para preenchimento -- impossibilitando assert final de submit da pagina!

        //country
        // podendo ser executado em uma linha sem necessidade de criacao de variavel
        // new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States of America");

        Select countryList = new Select(driver.findElement(By.id("country")));
        countryList.selectByVisibleText("United States of America");


        //inserindo as datas do nascimento
        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByVisibleText("1992");

        Select month = new Select(driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")));
        month.selectByIndex(3); //index 0 = month

        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByValue("29");



        //inserindo e confirmando password
        driver.findElement(By.id("firstpassword")).sendKeys("Abc123");
        driver.findElement(By.id("secondpassword")).sendKeys("Abc123");

        driver.findElement(By.id("submitbtn")).click();

        //finalizacao nao permite sucesso pois div id = countries está vazia

    }
}
