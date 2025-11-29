package EPAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.Invoker;

import java.util.List;

public class Getalllinks {
    public static WebDriver driver = Invoker.getDriver();

    @Test
    public void links() {
        driver.get("https://qa-practice.razvanvancea.ro/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {

            String href = link.getAttribute("href");
            System.out.println("href: " + links.indexOf(link) + " " + href);

        }

        driver.quit();

       /* List<WebElement> links = driver.findElements(By.xpath("//a/attribute::href"));

        for (WebElement link : links){
            System.out.println(link);
        }*/
    }
}