package testes;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.SliderPage;

public class SliderTest extends BaseTest {

    private SliderPage page;

    @Before
    public void setupAll() {
        page = new SliderPage();
        page.openURL();
    }

    @Test
    public void SliderTest() {
        page.slideSlider(50);
        Assert.assertEquals("left: 50%;",page.slideAttribute());
    }

}