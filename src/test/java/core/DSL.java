package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static core.DriverFactory.initDriver;


public class DSL {
    private WebDriver driver = initDriver();

    public void getURL(String url){
        driver.get(url);
    }
    public void write(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public void click(By by){
        driver.findElement(by).click();
    }
    public void findAndClickByLinkText(String texto){
        driver.findElement(By.linkText(texto)).click();
    }

    public void findAndSelectByVisibleText(By by, String texto){
        new Select(driver.findElement(by)).selectByVisibleText(texto);
    }
    public void radioClick(By by){
        driver.findElement(by).click();
    }
    public void findInListAndClick(By by, By el){
        driver.findElement(by).findElement(el).click();
    }
    public void switchToFrame(WebElement webElement) {
        driver.switchTo().frame(webElement);
    }
    public WebElement findElement(By by){
        return driver.findElement(by);
    }
    public void switchToFrame(String frame){
        driver.switchTo().frame(frame);
    }
    public void switchToFrame(int frame){
        driver.switchTo().frame(frame);
    }



    public void radioIsSelected(By by){
        driver.findElement(by).isSelected();
    }
    public String getTextFieldValue(By by){
        return driver.findElement(by).getAttribute("value");
    }
    public String getTextAtributteStyle(By by){
        return driver.findElement(by).getAttribute("style");
    }



}
