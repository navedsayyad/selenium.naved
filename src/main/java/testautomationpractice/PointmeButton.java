package testautomationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import webdrivermanager.GetDriver;

public class PointmeButton {
    public static WebDriver driver = GetDriver.getInstance();

    @Test()
    public void mousehover() {
        driver.get("https://testautomationpractice.blogspot.com/");

        Actions actions = new Actions(driver);
        WebElement pointme = driver.findElement(By.xpath("//button[@class='dropbtn']"));

        actions.moveToElement(pointme).perform();

        WebElement mobiles = driver.findElement(By.linkText("Mobiles"));

        actions.moveToElement(mobiles).click().perform();

        /*WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));

        actions.moveToElement(mobiles).click().perform();*/
    }
}
