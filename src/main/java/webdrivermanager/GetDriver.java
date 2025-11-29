package webdrivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetDriver {

    private static WebDriver driver;

    private GetDriver(){

    }

    public static WebDriver getInstance() {
        if (driver == null) {
            GetDriver GetDriver1 = new GetDriver();
            return GetDriver1.getDriver();
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
