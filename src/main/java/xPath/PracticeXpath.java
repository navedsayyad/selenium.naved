package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PracticeXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://qa-practice.netlify.app/");
        driver.manage().window().maximize();
        /*List<WebElement> buttons = driver.findElements(By.xpath("//ul[@id='ul-menu-items']//li//a//b"));
        for (int i = 0; i <= buttons.size() - 1; i++) {
            if (buttons.get(i).getText().equals("Products List - Shop")) {
                buttons.get(i).click();
                break;
            }
        }
        driver.findElement(By.xpath("//button[text()='PURCHASE']")).click();
        driver.findElement(By.xpath("//a[@id='back_to_prods_list']")).click();
        driver.findElement(By.xpath("//a[@id='buttons']")).click();
        driver.findElement(By.xpath("//a[@id= 'checkboxes']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//a[@id='actions']")).click();
        //Double click on an element
        WebElement dbclick = driver.findElement(By.id("double-click"));
        Actions actions = new Actions(driver);
        actions.doubleClick(dbclick).perform();
        driver.findElement(By.xpath("//a[@id='actions']")).click();
        //Scrolling on the webpage
        driver.findElement(By.id("scrolling")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
        driver.findElement(By.xpath("//a[@id='date-picker']")).click();
        driver.findElement(By.xpath("//input[@id='calendar']")).click();
        //String selecteddate = "18";
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=' table-condensed']//td[@class='day']"));
        for (int j=0; j < dates.size()-1; j++){
            if (dates.get(j).getText().equals("3")){
                dates.get(j).click();
            }
        }
    }
}

