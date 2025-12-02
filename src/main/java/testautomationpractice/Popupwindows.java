package testautomationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Popupwindows {

    @Test(invocationCount = 4)
    public void popupwindows() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://testautomationpractice.blogspot.com/");

        String targetwindowtitle = "Fast and reliable end-to-end testing for modern web apps | Playwright";
        String parentwindow = driver.getWindowHandle();
        System.out.println("parent window : " + parentwindow);

        driver.findElement(By.cssSelector("#PopUp")).click();

        Set<String> allwindows = driver.getWindowHandles();

        for (String window : allwindows) {
            //System.out.println("other windows : " + window);
            driver.switchTo().window(window);

            if (driver.getTitle().equals(targetwindowtitle)) {
                System.out.println("switched to window : " + targetwindowtitle);
                System.out.println("Window handle : " + driver.getWindowHandle());
                System.out.println("Window title : " + driver.getTitle());
            }
        }

        driver.quit();
    }
}
