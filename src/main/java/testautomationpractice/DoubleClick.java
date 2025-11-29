package testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import webdrivermanager.GetDriver;

public class DoubleClick {

    public static WebDriver driver = GetDriver.getInstance();

    @Test()
    public void doubleclick() {
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

        box1.clear();
        box1.sendKeys("naved");

        Actions action = new Actions(driver);
        action.doubleClick(button).build().perform();
    }
}
