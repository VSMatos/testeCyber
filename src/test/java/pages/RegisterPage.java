package pages;

import core.BasePage;
import org.openqa.selenium.By;

import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class RegisterPage extends BasePage {

    private By inputName = By.xpath("//input[@placeholder='First Name']");

    private By inputLastName = By.xpath("//input[@placeholder='Last Name']");

    private By inputAdress = By.xpath("//textarea");

    private By inputEmail = By.xpath("//input[@type='email']");

    private By inputTel = By.xpath("//input[@type='tel']");

    private By languageField = By.id("msdd");

    private By inputSkills = By.id("Skills");

    private By inputCountry = By.id("country");

    private By inputDay = By.id("daybox");

    private By inputMonth = By.xpath("//select[@placeholder='Month']");

    private By inputYear = By.id("yearbox");

    private By attachFile = By.xpath("//input[@id='imagesrc']");

    private By submitButton = By.id("submitbtn");

    public void openURL(){
        dsl.getURL("Register.html");
    }

    public void setName(){
        dsl.write(inputName,"Name");
    }

    public void setName(String name){
        dsl.write(inputName,name);
    }

    public void setSecondName(){
        dsl.write(inputLastName,"SecondName");
    }

    public void setSecondName(String secondName){
        dsl.write(inputLastName,secondName);
    }

    public void setAdress(String adress){
        dsl.write(inputAdress,adress);
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
        dsl.write(inputEmail,generateRandomEmailAdress()+"@yourprovider.com");
    }
    public void setEmail(String email){
        dsl.write(inputEmail,email);
    }

    public void setTel(String tel){
        dsl.write(inputTel,tel);
    }

    public void setTel(){
        Random random = new Random();
        int[] tel = new int[10];

        for(int i =0; i<tel.length; i++){
            tel[i] = random.nextInt(10);
        }
        dsl.write(inputTel, Arrays.toString(tel).replaceAll("\\[|\\]|,|\\s", ""));
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
            dsl.click(languageField);
            dsl.findAndClickByLinkText(language);
        }
    }

    public void setSkills(String skill){
        dsl.findInListAndClick(inputSkills,By.xpath("//option[. = '"+skill+"']"));
    }

    public void setCountry(String country){
        dsl.findAndSelectByVisibleText(inputCountry,country);
    }

    public void setDay(String day){
        dsl.findAndSelectByVisibleText(inputDay,day);
    }

    public void setMonth(String month){
        dsl.findAndSelectByVisibleText(inputMonth,month);
    }

    public void setYear(String year){
        dsl.findAndSelectByVisibleText(inputYear,year);
    }

    public void setPassword(String fieldId, String password){
        dsl.write(By.id(fieldId),password);
    }

    public void attachFile(){
        dsl.write(attachFile,"C:"+ File.separator + "Users"+ File.separator +"vitor"+ File.separator + "IdeaProjects"+ File.separator +"projetoTesteCyber"+ File.separator +"testeCyber"+ File.separator +"target"+ File.separator +"screenshot"+ File.separator +"testeimg.jpg");
    }

    public String attachAtributte(){
        System.out.println(dsl.getTextFieldValue(attachFile));
        return dsl.getTextFieldValue(attachFile);
    }

    public void submit(){
        dsl.click(submitButton);
    }
}
