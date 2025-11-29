package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alert {
    public static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-practice.netlify.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id=\"alerts\"]")).click();
        driver.findElement(By.xpath("//button[@id=\"alert-btn\"]")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@id=\"confirm-btn\"]")).click();
        driver.switchTo().alert().dismiss();
    }
}
