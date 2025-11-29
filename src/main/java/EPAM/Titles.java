package EPAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.Invoker;

import java.util.List;

public class Titles {

    public static WebDriver driver = Invoker.getDriver();

    @Test()
    public void getalltitles() {
        driver.get("https://qa-practice.razvanvancea.ro/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (int i = 0; i < links.size(); i++) {
            WebElement link = links.get(i);
            String linktext = link.getText();
            System.out.println("Title of link " + (i + 1) + " :" + linktext);
        }
    }
}
