
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CenarioUmPage {

    private DSL dsl;
    public CenarioUmPage(WebDriver driver){
        dsl = new DSL(driver);
    }



    public void setName(){ //DEFAULT
        //dsl.writeWithXpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input", "Nome");
        dsl.write(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"),"Name");
    }

    public void setName(String nome){
        //dsl.writeWithXpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input", "Nome");
        dsl.write(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"),nome);
    }


    public void setSecondName(){
        dsl.write(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input"),"SecondName");
    }
    public void setSecondName(String sobrenome){
        dsl.write(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input"),sobrenome);
    }

    public void setAdress(String endereco){
        dsl.write(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"),endereco);
    }

    public void setEmail(String email){
        dsl.write(By.xpath("//*[@id='eid']/input"),email);
    }

    public void setTel(String telefone){
        dsl.write(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"),telefone);
    }

    public void setGender(String sexo){
        if (sexo == "masculino") {
            dsl.radioClick(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
        }else if (sexo == "feminino"){
            dsl.radioClick(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));
        }

        // dsl.radioClick(By.xpath(String.format("//input[@value=%s]",sexo)));
    }

    public void setHobbies(String... hobbies){    //precisa de impletacao para caso de mais de 1 hobbie
        for(String hobbie:hobbies) {
            if (hobbie == "cricket") {
                dsl.radioClick(By.id("checkbox1"));
            } else if (hobbie == "movies") {
                dsl.radioClick(By.id("checkbox2"));
            } else if (hobbie == "hockey") {
                dsl.radioClick(By.id("checkbox3"));
            }
        }
    }

    public void setLanguages(String... languages){
        for (String language: languages) {
            dsl.click(By.id("msdd"));
            dsl.findAndClickByLinkText(language);
        }
    }

    //skills direto na dsl
    public void setSkills(String skill){
        dsl.findInListAndClick(By.id("Skills"),By.xpath("//option[. = '"+skill+"']"));

    }

    public void setCountry(String country){
        dsl.findAndSelectByVisibleText(By.id("country"),country);

    }

    public void setDay(String day){
        dsl.findAndSelectByVisibleText(By.id("daybox"),day);
    }
    public void setMonth(String month){
        dsl.findAndSelectByVisibleText(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select"),month);
    }
    public void setYear(String year){
        dsl.findAndSelectByVisibleText(By.id("yearbox"),year);
    }

    public void setPassword(String id_campo, String password){
        dsl.write(By.id(id_campo),password);

    }

    public void submit(){
        dsl.click(By.id("submitbtn"));
    }


}
