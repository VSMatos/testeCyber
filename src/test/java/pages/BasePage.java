package pages;
import core.DSL;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    protected DSL dsl;
    private WebDriver driver;

    public BasePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        dsl = new DSL(driver);

        driver.manage().window().setSize(new Dimension(1381, 742));
    }

}
