package pages;

import org.openqa.selenium.By;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class DatePickerPage extends BasePage {

    public void openURL(){
        dsl.getURL("https://demo.automationtesting.in/Datepicker.html");
    }


    public void writeInDatePicker(String mesanodia){
        dsl.write(By.id("datepicker2"),mesanodia);
    }

    public void openDisabledDatePicker(){
        dsl.click(By.id("datepicker1"));
    }

    public void setDateInDisabledDatePicker(String dd, String mm, String yyyy){
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatterYear = DateTimeFormatter.ofPattern("yyyy");
        DateTimeFormatter formatterMonth = DateTimeFormatter.ofPattern("MM");
        int currentYear = Integer.parseInt(today.format(formatterYear));
        int currentMonth = Integer.parseInt(today.format(formatterMonth));
        int year = Integer.parseInt(yyyy);
        int month = Integer.parseInt(mm);
        int difInMonths = ((currentYear - year) *12) + (currentMonth - month) -1;

        for (int i =0 ; i <= difInMonths; i++){
            dsl.click(By.cssSelector("a[data-handler=prev]"));
        }
        dsl.click(By.xpath("//a[text()="+dd+"]"));

    }


}
