package testautomationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoSuggestDropdown {
    @Test()
    public void autosuggestdropdown() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
        List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println("Size of options : " + options.size());

        for (int i = 0; i <= options.size(); i++) {
            System.out.println(options.get(i).getText());
            if (options.get(i).getText().equals("selenium")) {
                options.get(i).click();
                break;
            }
        }
    }
}
