package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SliderPage extends BasePage {
    public void openURL(){
        dsl.getURL("https://demo.automationtesting.in/Slider.html");
    }
    public void slideSlider(int porcetagem){
        WebElement slider = dsl.findElement(By.cssSelector("#slider > a"));

        for (int i = 1; i <= porcetagem ; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public String slideAttribute(){
        return dsl.getTextAtributteStyle(By.cssSelector("#slider > a"));
    }
}
