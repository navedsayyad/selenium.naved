package test;

import webdrivermanager.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWait {

    @Test()
    public void explicitwait() {
        WebDriver driver = GetDriver.getInstance();
        driver.get("https://qa-practice.razvanvancea.ro/auth_ecommerce.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("admin@admin.com");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        password.sendKeys("admin123");

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitLoginBtn")));
        submit.click();

        //Fluent wait
        FluentWait<WebDriver> wait1 = new FluentWait<>(driver);
        wait1.withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                        .ignoring(NoSuchElementException.class);


        driver.quit();
    }
}
