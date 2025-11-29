package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class PracticeWindowHandle {

    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://qa-practice.razvanvancea.ro/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='buttons' and @href='#browserSubmenu']")).click();
        driver.findElement(By.xpath("//a[@id='browser-window']")).click();
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
        //System.out.println(parent);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        for (String wins: windows){
            if (!(wins.equals(parent))){
                driver.switchTo().window(wins);
            }
        }
        WebElement element = driver.findElement(By.xpath("//td[text()='mo@email.com']"));
        String elementtext = element.getText();
        System.out.println(elementtext);
    }
}
