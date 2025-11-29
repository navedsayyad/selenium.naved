package testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import webdrivermanager.GetDriver;

public class DragDrop {
    public static WebDriver driver = GetDriver.getInstance();

    @Test()
    public void dragdrop() {
        driver.get("https://testautomationpractice.blogspot.com/");
        Actions action = new Actions(driver);

        WebElement dragsource = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropsource = driver.findElement(By.xpath("//div[@id='droppable']"));

        action.dragAndDrop(dragsource,dropsource).perform();
    }
}
