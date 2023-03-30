import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CenarioDois {


        public WebDriver driver;
        private CenarioDoisPage page;

        @Before
        public void setupAll() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            page = new CenarioDoisPage(driver);
            driver.get("https://demo.automationtesting.in/Frames.html");
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




