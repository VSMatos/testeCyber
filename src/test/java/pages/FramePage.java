package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {
    private DSL dsl;

    public FramePage(WebDriver driver) { dsl = new DSL(driver);}



    public void switchToIframe(String iframe){
        dsl.switchToFrame(iframe);
    }
    public void switchToIframe(int iframe){
        dsl.switchToFrame(iframe);
    }
    public void switchToSecondIframe(){
        dsl.switchToFrame(dsl.findElement(By.xpath("//*[@id='Multiple']/iframe")));
    }
    public void writeInFrame(String texto){
        dsl.write(By.tagName("input"),texto);
    }
    public void openSecondCase(){
        dsl.click(By.xpath("//a[starts-with(@href, '#M')]"));
    }

}
