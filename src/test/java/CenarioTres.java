import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CenarioTres {
    public WebDriver driver;
    //public WebDriverWait wait;

    @Before
    public void setupAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //wait = new WebDriverWait((WebDriver) wait,5);
    }


    @After
    public void fecharNavegador() {
        //driver.quit();
    }
    @Test
    public void dataPicker() throws InterruptedException {

        driver.get("https://demo.automationtesting.in/Datepicker.html");
        Assert.assertEquals("Datepicker", driver.getTitle());
        //driver.manage().window().maximize();

        driver.findElement(By.id("datepicker2")).sendKeys("03/29/1992");

        driver.findElement(By.id("datepicker1")).click();
//        driver.findElement(By.cssSelector("a[data-handler=prev]"));


        for (int i =0 ; i <= ((12*31)-1); i++){
            driver.findElement(By.cssSelector("a[data-handler=prev]")).click();

        }

        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[1]/a")).click();
    }

}
