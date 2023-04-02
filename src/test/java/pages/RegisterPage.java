package pages;

import core.BasePage;
import org.openqa.selenium.By;
import java.util.Arrays;
import java.util.Random;

public class RegisterPage extends BasePage {

    public void openURL(){
        dsl.getURL("Register.html");
    }

    public void setName(){
        dsl.write(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"),"Name");
    }

    public void setName(String name){
        dsl.write(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"),name);
    }

    public void setSecondName(){
        dsl.write(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input"),"SecondName");
    }

    public void setSecondName(String secondName){
        dsl.write(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input"),secondName);
    }

    public void setAdress(String adress){
        dsl.write(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"),adress);
    }

    public void setEmail(String email){
        dsl.write(By.xpath("//*[@id='eid']/input"),email);
    }

    public void setTel(String tel){
        dsl.write(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"),tel);
    }

    public void setTel(){
        Random random = new Random();
        int[] tel = new int[10];

        for(int i =0; i<tel.length; i++){
            tel[i] = random.nextInt(10);
        }

        dsl.write(By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input"), Arrays.toString(tel).replaceAll("\\[|\\]|,|\\s", ""));
    }

    public void setGender(String sex){
        if (sex.equals("masculino")) {
            dsl.radioClick(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input"));
        }else if (sex.equals("feminino")){
            dsl.radioClick(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));
        }

        // dsl.radioClick(By.xpath(String.format("//input[@value=%s]",sexo)));
    }

    public void setHobbies(String... hobbies){
        for(String hobbie:hobbies) {
            if (hobbie.equals("cricket")) {
                dsl.radioClick(By.id("checkbox1"));
            } else if (hobbie.equals("movies")) {
                dsl.radioClick(By.id("checkbox2"));
            } else if (hobbie.equals("hockey")) {
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

    public void clickDebug(){
        dsl.click(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
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

    public void setPassword(String fieldId, String password){
        dsl.write(By.id(fieldId),password);

    }

    public void submit(){
        dsl.click(By.id("submitbtn"));
    }


}
