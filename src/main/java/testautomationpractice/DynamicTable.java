package testautomationpractice;

import webdrivermanager.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DynamicTable {
    public static WebDriver driver = GetDriver.getInstance();

    @Test()
    public void dynamictable() {
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement table = driver.findElement(By.xpath("//table[@id='taskTable']"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        System.out.println("Total rows : " + rows.size());

        for (WebElement row : rows){
            List<WebElement> cells = row.findElements(By.xpath(".//th|.//td"));
            for (WebElement cell : cells){
                System.out.print(cell.getText().trim() + " | ");
            }
            System.out.println();
        }

        driver.quit();
    }
}
