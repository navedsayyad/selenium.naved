package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class GeminiRound2Select {

    WebDriver driver = new ChromeDriver();

    @Test()
    public void dropdown() {
        driver.get("https://qa-practice.razvanvancea.ro/dropdowns.html");
        WebElement dropdown = driver.findElement(By.id("dropdown-menu"));

        Select select = new Select(dropdown);

        List<WebElement> droplist = select.getOptions();

        for (WebElement list : droplist){
            System.out.println(list.getText());
        }
    }
}
