package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;
    private DriverFactory(){}

    public static WebDriver initDriver(){
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(1381, 742));
            //driver.manage().window().maximize();
        }
        return driver;
    }

    public static void killDriver(){
        if (driver != null){
            //driver.quit();
            driver.close();
            driver = null;
        }
    }


}
