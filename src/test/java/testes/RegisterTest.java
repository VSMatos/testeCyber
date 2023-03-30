package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.RegisterPage;


public class RegisterTest {


    private RegisterPage page;

    @Before
    public void setupAll() {
        page = new RegisterPage();
        page.openURL();
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
        //impossivel validar devido a compo pais que esta quebrado;
    }
}
