package testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import webdrivermanager.GetDriver;

public class Slider {
    public static WebDriver driver = GetDriver.getInstance();

    @Test()
    public void mousehover() throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement minslider = driver.findElement(By.xpath("//div[@id='slider-range']/child::span[1]"));

        System.out.println("minimum slider location : " + minslider.getLocation()); //(974, 2024)

        Actions actions = new Actions(driver);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", minslider);

        Thread.sleep(3000);

        actions.dragAndDropBy(minslider, 50, 0).perform();

        System.out.println("minimum slider location after drag drop : " + minslider.getLocation());

        WebElement maxslider = driver.findElement(By.xpath("//div[@id='slider-range']/child::span[2]"));

        Actions actions1 = new Actions(driver);

        Thread.sleep(2000);

        actions1.dragAndDropBy(maxslider,-50,0).perform();

        System.out.println("max slider location : " + maxslider.getLocation());

        driver.quit();
    }
}
