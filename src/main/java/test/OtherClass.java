package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OtherClass {

    public static WebDriver driver = Invoker.getDriver();

    @Test
    public void second()
    {
        driver.get("https://qa-practice.razvanvancea.ro/auth_ecommerce.html");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(Keys.TAB);
        /*driver.findElement(By.xpath("//button[text()='PURCHASE']")).click();
        driver.findElement(By.xpath("//a[@id='back_to_prods_list']")).click();
        driver.findElement(By.xpath("//a[@id='buttons']")).click();
        driver.findElement(By.xpath("//a[@id= 'checkboxes']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//a[@id='actions']")).click();*/

    }
}
