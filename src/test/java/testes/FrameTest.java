package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.FramePage;

public class FrameTest {
        private FramePage page;

        @Before
        public void setupAll() {
            page = new FramePage();
            page.openURL();
        }

        @After
        public void fecharNavegador() {
            //driver.quit();
        }

        @Test
        public void writeInIframe(){
            page.switchToIframe("singleframe");
            page.writeInFrame("Teste de texto no frame um!");
        }
        @Test
        public void writeIframeInIframe(){
            page.openSecondCase();
            page.switchToSecondIframe();

            //int size = driver.findElements(By.tagName("iframe")).size();
            //System.out.println("Total Frames --" + size);

            page.switchToIframe(0);
            page.writeInFrame("Teste de texto em Iframes aninhados");


    }

}




