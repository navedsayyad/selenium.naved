package testautomationpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Headless {

    @Test()
    public void headless() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        String title = driver.getTitle();
        if (title.equals("Automation Testing Practice")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
