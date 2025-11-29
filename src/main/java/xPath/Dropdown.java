package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import test.Invoker;

public class Dropdown {

    public static WebDriver driver = Invoker.getDriver();

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://qa-practice.netlify.app/");
        driver.findElement(By.xpath("//a[@id=\"dropdowns\"]")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@id=\"dropdown-menu\"]")));
        select.selectByVisibleText("Algeria");
        Thread.sleep(2000);
        select.selectByIndex(6);
        Thread.sleep(2000);
        select.selectByValue("Armenia");
        Thread.sleep(2000);

    }
}
