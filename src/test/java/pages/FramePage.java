package pages;
import core.BasePage;
import org.openqa.selenium.By;


public class FramePage extends BasePage {
    public void openURL(){
        dsl.getURL("Frames.html");
    }
    public void switchToIframe(String iframe){
        dsl.switchToFrame(iframe);
    }
    public void switchToIframe(int iframe){
        dsl.switchToFrame(iframe);
    }
    public void switchToFirstIframe(){
        dsl.switchToFrame(dsl.findElement(By.xpath("//*[@id='Multiple']/iframe")));
    }
    public void writeInFrame(String text){
        dsl.write(By.tagName("input"),text);
    }
    public void openSecondCase(){
        dsl.click(By.xpath("//a[starts-with(@href, '#M')]"));
    }

    public String valueOfTextFieldInFrames(){
        return dsl.getTextFieldValue(By.tagName("input"));
    }

}
