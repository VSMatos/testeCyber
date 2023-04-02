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
        dsl.write(By.xpath("//input[@placeholder='First Name']"),"Name");
    }

    public void setName(String name){
        dsl.write(By.xpath("//input[@placeholder='First Name']"),name);
    }

    public void setSecondName(){
        dsl.write(By.xpath("//input[@placeholder='Last Name']"),"SecondName");
    }

    public void setSecondName(String secondName){
        dsl.write(By.xpath("//input[@placeholder='Last Name']"),secondName);
    }

    public void setAdress(String adress){
        dsl.write(By.xpath("//textarea"),adress);
    }

    protected String generateRandomEmailAdress() {
        String chars = "abcdefghijklmnopqrstuvywxz1234567890";
        StringBuilder randomString = new StringBuilder();
        Random rnd = new Random();
        while (randomString.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * chars.length());
            randomString.append(chars.charAt(index));
        }
        String randomStr = randomString.toString();
        return randomStr;

    }
    public void setEmail(){
        dsl.write(By.xpath("//input[@type='email']"),generateRandomEmailAdress()+"@yourprovider.com");
    }
    public void setEmail(String email){
        dsl.write(By.xpath("//input[@type='email']"),email);
    }

    public void setTel(String tel){
        dsl.write(By.xpath("//input[@type='tel']"),tel);
    }

    public void setTel(){
        Random random = new Random();
        int[] tel = new int[10];

        for(int i =0; i<tel.length; i++){
            tel[i] = random.nextInt(10);
        }
        dsl.write(By.xpath("//input[@type='tel']"), Arrays.toString(tel).replaceAll("\\[|\\]|,|\\s", ""));
    }

    public void setGender(String sex){
        if (sex.equals("masculino")) {
            dsl.radioClick(By.xpath("//input[@value='Male']"));
        }else if (sex.equals("feminino")){
            dsl.radioClick(By.xpath("//input[@value='FeMale']"));
        }
        // dsl.radioClick(By.xpath(String.format("//input[@value=%s]",sexo)));
    }

    public void setHobbies(String... hobbies){
        for(String hobbie:hobbies) {
            switch (hobbie) {
                case "cricket" -> dsl.radioClick(By.id("checkbox1"));
                case "movies" -> dsl.radioClick(By.id("checkbox2"));
                case "hockey" -> dsl.radioClick(By.id("checkbox3"));
            }
        }
    }

    public void setLanguages(String... languages){
        for (String language: languages) {
            dsl.click(By.id("msdd"));
            dsl.findAndClickByLinkText(language);
        }
    }

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
        dsl.findAndSelectByVisibleText(By.xpath("//select[@placeholder='Month']"),month);
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
