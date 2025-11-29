package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PageNavigation {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-practice.netlify.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id=\"pagination\"]")).click();
        List<WebElement> navigate = driver.findElements(By.xpath("//li[@class=\"page-item\"]"));

        WebElement next = driver.findElement(By.xpath("//a[@onclick=\"showPageNumber(4)\"]"));
        //next.isEnabled();
        boolean page = true;
        while (page)
        {
            System.out.println("print first time");
            if (next.isDisplayed() && next.isEnabled()){
                next.click();
                break;
            }
            else {
                page=false;
            }
        }
    }

}
