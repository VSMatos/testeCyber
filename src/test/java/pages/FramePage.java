package pages;
import org.openqa.selenium.By;


public class FramePage extends BasePage {
    public void openURL(){
        dsl.getURL("https://demo.automationtesting.in/Frames.html");
    }
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
