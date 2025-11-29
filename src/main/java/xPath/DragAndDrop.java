package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();

        Actions actions = new Actions(driver);
        actions.clickAndHold(driver.findElement(By.id("column-a")))
                .moveToElement(driver.findElement(By.id("column-b"))).release().build().perform();
    }
}
