package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.DatePickerPage;

public class DatePickerTest {
    private DatePickerPage page;

    @Before
    public void setupAll() {
        page = new DatePickerPage();
    }

    @After
    public void fecharNavegador() {
        //driver.quit();
    }

    @Test
    public void datePickerAtt() {
        page.openURL();
        page.writeInDatePicker("03/29/1992");
    }

    @Test
    public void datePickerDisabled() {
        page.openURL();
        page.openDisabledDatePicker();
        page.setDateInDisabledDatePicker("29", "03", "1992");
    }

}