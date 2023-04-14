package testes;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    private RegisterPage page;

    @Before
    public void setupAll() {
        page = new RegisterPage();
        page.openURL();
    }

    @Test
    public void registerTest() {
        page.setName();
        page.setSecondName();
        page.setAddress("Rua da rua, Bairro: Centro - Cidade - Brasil");
        page.setEmail();
        page.setTel();
        page.setGender("masculino");
        page.setHobbies("cricket", "movies");
        page.setLanguages("Portuguese", "English", "Spanish");
        page.setSkills("Javascript");
        page.setCountry("United States of America");
        page.setDay("29");
        page.setMonth("March");
        page.setYear("1992");
        page.setPassword("firstpassword", "Abc123");
        page.setPassword("secondpassword", "Abc123");
        page.attachFile();
        Assert.assertTrue(page.attachAttribute().contains("testeimg.jpg"));
        page.submit();
        Assert.assertEquals("Cadastro OK!", "");
        //impossivel validar devido o campo pais que estar com bug;
    }
}
