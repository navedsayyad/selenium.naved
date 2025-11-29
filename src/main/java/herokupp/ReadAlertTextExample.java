package herokupp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAlertTextExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Alert alert = driver.switchTo().alert();

        String alerttext = alert.getText();

        System.out.println(alerttext);

        alert.accept();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Alert alert1 = driver.switchTo().alert();

        alert1.dismiss();

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

        Alert alert2 = driver.switchTo().alert();

        alert2.sendKeys("Naved");

        Thread.sleep(2000);

        alert2.accept();

        driver.quit();

    }
}

