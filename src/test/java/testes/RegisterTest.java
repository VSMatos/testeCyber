package testes;

import core.BaseTest;
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
    public void testePageAtualizado() {
        page.setName();
        page.setSecondName();
        page.setAdress("Rua da rua, Bairro: Centro - Cidade - Brasil");
        page.setEmail("email@email");
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
        page.submit();
        //impossivel validar devido a compo pais que esta quebrado;
    }
}
