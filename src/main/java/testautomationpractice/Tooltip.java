package testautomationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tooltip {
    @Test()
    public void tooltip() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");

        WebElement input = driver.findElement(By.xpath("//input[@id='firstname']"));
        String tooltiptext = input.getAttribute("title");
        String expectedtooltiptext = "Please provide your firstname.";
        Assert.assertEquals(expectedtooltiptext, tooltiptext);
        driver.quit();
    }
}
