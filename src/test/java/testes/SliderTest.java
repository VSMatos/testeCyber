package testes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pages.SliderPage;

public class SliderTest {
    private SliderPage page;

    @Before
    public void setupAll() {
        page = new SliderPage();
        page.openURL();
    }

    @After
    public void fecharNavegador() {
        //driver.quit();
    }

    @Test
    public void SliderTestAtt() {
        page.slideSlider(50);
        Assert.assertEquals("left: 50%;",page.slideAttribute());
    }

}