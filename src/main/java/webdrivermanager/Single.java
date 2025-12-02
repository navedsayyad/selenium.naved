package webdrivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Single {
    private static WebDriver driver;

    private Single() {
    }

    public static WebDriver getInstance() {
        if (driver == null) {
            Single s1 = new Single();
            return s1.getDriver();
        } else {
            return driver;
        }
    }

    private WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        return driver;
    }
}
