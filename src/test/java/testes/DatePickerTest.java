package testes;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.DatePickerPage;

public class DatePickerTest extends BaseTest {
    private DatePickerPage page;

    @Before
    public void setupAll() {
        page = new DatePickerPage();
    }

    @Test
    public void datePickerAtt() {
        page.openURL();
        page.writeInDatePicker("03/29/1992");
        Assert.assertEquals("03/29/1992",page.getDate());
    }

    @Test
    public void datePickerDisabled() {
        page.openURL();
        page.openDisabledDatePicker();
        page.setDateInDisabledDatePicker("29", "03", "1992");
        Assert.assertEquals("03/29/1992",page.getDisabledDate());
    }
}