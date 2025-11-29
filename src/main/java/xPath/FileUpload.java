package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://qa-practice.netlify.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id=\"file-upload-item\"]")).click();
        driver.findElement(By.xpath("//input[@id=\"file_upload\"]")).sendKeys("C:\\Users\\naved\\OneDrive\\Pictures\\Screenshots\\ss.png");
        driver.findElement(By.xpath("//button[@onclick=\"uploadFile()\"]")).click();
    }
}
