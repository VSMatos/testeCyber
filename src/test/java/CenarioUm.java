

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;




public class CenarioUm {


    public WebDriver driver;
    private CenarioUmPage page;

    @Before
    public void setupAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        page = new CenarioUmPage(driver);

        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().setSize(new Dimension(1381, 742));

    }


    @After
    public void fecharNavegador() {
        //driver.quit();
    }


    @Test
    public void testePageAtualizado() {
        page.setName(); //default "Name"
        page.setSecondName(); // default "SecondName"
        page.setAdress("Rua da rua, Bairro: Centro - Cidade - Brasil");
        page.setEmail("email@email");
        page.setTel("1234567890");
        page.setGender("masculino"); // masculino ou feminino

        page.setHobbies("cricket", "movies");

        page.setLanguages("Portuguese", "English", "Spanish");
        page.setSkills("Javascript");
        page.setCountry("United States of America");

        //datas
        page.setDay("29");
        page.setMonth("March");
        page.setYear("1992");

        page.setPassword("firstpassword", "Abc123");
        page.setPassword("secondpassword", "Abc123");
        page.submit();
    }
}
