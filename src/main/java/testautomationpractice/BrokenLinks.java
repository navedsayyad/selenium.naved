package testautomationpractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks {
    @Test()
    public void tooltip() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> elementList = driver.findElements(By.tagName("a"));
        List<String> linkaddress = new ArrayList<>();

        for (WebElement element : elementList) {
        linkaddress.add(element.getAttribute("href"));
        }

        System.out.println("total links are : " + linkaddress.size());

        for (String link : linkaddress){
            URL url = new URL(link);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(3000);
            System.out.println(link);
            System.out.println(httpURLConnection.getResponseCode());
            System.out.println();
        }

        driver.quit();
    }
}
