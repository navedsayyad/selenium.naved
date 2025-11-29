package test;

import Utilities.XpathUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Testngpractice extends Invoker {

    public static WebDriver driver = Invoker.getDriver();

    @Test (priority = 2,enabled = true)
    public static void testmethod(){
        System.out.println("testmethod2");
    }

    @Test(enabled = false)
    public void testngpractice() {
        driver.get("https://qa-practice.razvanvancea.ro/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(XpathUtils.getXpath("dropdown"))).click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpath")));
        driver.findElement(By.xpath("xpath")).click();

        /*List<WebElement> buttons = driver.findElements(By.xpath("//ul[@id='ul-menu-items']//li//a//b"));
        for (int i = 0; i <= buttons.size() - 1; i++) {
            if (buttons.get(i).getText().equals("Products List - Shop")) {
                buttons.get(i).click();
                break;
            }
        }*/

    }

    @Test(priority = 3, enabled = true)
    public void testmethod1(){
        System.out.println("testmethod1");
    }

    @Test(priority = 0)
    public void iFrame() throws IOException {
        driver.get("https://qa-practice.razvanvancea.ro/");
        driver.findElement(By.xpath("//a[@id=\"iframes\"]")).click();
        driver.switchTo().frame("iframe-checkboxes");
        driver.findElement(By.xpath("//a[@id=\"learn-more\"]")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("alerts")).click();


        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\naved\\OneDrive\\Desktop\\ss1.jpeg");
        FileUtils.copyFile(sourceFile,destinationFile);


    }

    @Test(priority = 4, enabled = true)
    public void dropdown() throws InterruptedException {
        driver.get("https://qa-practice.razvanvancea.ro/");
        System.out.println(XpathUtils.getXpath("dropdown"));
        driver.findElement(By.xpath(XpathUtils.getXpath("dropdown"))).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@id=\"dropdown-menu\"]")));
        select.selectByVisibleText("Algeria");
        //Thread.sleep(2000);
        select.selectByIndex(6);
        //Thread.sleep(2000);
        select.selectByValue("Armenia");
        //Thread.sleep(2000);
        System.out.println(XpathUtils.getXpath("fileupload"));
        driver.findElement(By.xpath(XpathUtils.getXpath("fileupload"))).click();
        driver.quit();
    }

    @Test(enabled = true)
    public void printf(){
        System.out.println("f");
    }

    @Test (enabled = false )
    public void jsexec(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        WebElement destination = driver.findElement(By.xpath("//a[@id=\"date-picker\"]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", destination);
        destination.click();
    }
}