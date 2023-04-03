package testes;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.FramePage;

public class FrameTest extends BaseTest {

        private FramePage page;

        @Before
        public void setupAll() {
            page = new FramePage();
            page.openURL();
        }

        @Test
        public void writeInIframe(){
            page.switchToIframe("singleframe");
            page.writeInFrame("Teste de texto no frame um!");
            Assert.assertEquals("Teste de texto no frame um!",page.valueOfTextFieldInFrames());
        }

        @Test
        public void writeIframeInIframe(){
            page.openSecondCase();
            page.switchToFirstIframe();
            page.switchToIframe(0);
            page.writeInFrame("Teste de texto em Iframes aninhados");
            Assert.assertEquals("Teste de texto em Iframes aninhados",page.valueOfTextFieldInFrames());
    }

}




