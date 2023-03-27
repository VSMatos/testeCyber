import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CenarioQuatro {
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
    public void testeSlider(){
        driver.get("https://demo.automationtesting.in/Slider.html");
        Assert.assertEquals("Slider", driver.getTitle()); // verificar titulo inicial
        driver.manage().window().maximize();


        WebElement slider = driver.findElement(By.cssSelector("#slider > a"));

            for (int i = 1; i <= 50 ; i++) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            }

        Assert.assertEquals("left: 50%;", slider.getAttribute("style"));


        /*

        Executando com action (funcional porem o slider e movido por unidades de pixel nao porcetagem)

        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/a"));
        Actions moveSlider = new Actions(driver);
        Action action = (Action) moveSlider.dragAndDropBy(slider,335,0).build();
        action.perform();
        */
    }

}
