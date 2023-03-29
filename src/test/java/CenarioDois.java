import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CenarioDois {


        public WebDriver driver;

        @Before
        public void setupAll() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            //wait = new WebDriverWait((WebDriver) wait,5);
            driver.get("https://demo.automationtesting.in/Frames.html");
        }

        @After
        public void fecharNavegador() {
            //driver.quit();
        }
        @Test
        public void writeInIframe(){


//            Assert.assertEquals("Frames", driver.getTitle());


            driver.switchTo().frame("singleframe");
            driver.findElement(By.tagName("input")).sendKeys("Teste de texto no iframe");
            Assert.assertEquals("Teste de texto no iframe",driver.findElement(By.tagName("input")).getAttribute("value"));

        }

        @Test
        public void writeIframeInIframe() throws InterruptedException {

            //Assert.assertEquals("Frames", driver.getTitle());


            driver.findElement(By.xpath("//a[starts-with(@href, '#M')]")).click();
            //driver.findElement(By.cssSelector("body > section > div.container.center > div > div > div > div.col-xs-11.col-xs-offset-1 > div > ul > li.active > a")).click();

            WebElement frameUm = driver.findElement(By.cssSelector("#Multiple > iframe"));
            WebElement frameDois = driver.findElement(By.tagName("iframe"));

            driver.switchTo().frame(frameUm);

            //int size = driver.findElements(By.tagName("iframe")).size();
            //System.out.println("Total Frames --" + size);

            driver.switchTo().frame(0);
            driver.findElement(By.tagName("input")).sendKeys("Teste de texto no iframe IN a iframe");
        }

}




