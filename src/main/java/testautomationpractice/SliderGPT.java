package testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import test.Invoker;

public class SliderGPT {
    public static WebDriver driver = Invoker.getDriver();

    @Test()
    public void slidergpt(){
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));

// Location BEFORE movement
        Point before = slider.getLocation();
        System.out.println("Before Drag → X: " + before.getX() + "  Y: " + before.getY());

// Move slider by 150 pixels horizontally
        Actions act = new Actions(driver);
        act.dragAndDropBy(slider, 150, 0).perform();

// Location AFTER movement
        Point after = slider.getLocation();
        System.out.println("After Drag → X: " + after.getX() + "  Y: " + after.getY());
    }
}
