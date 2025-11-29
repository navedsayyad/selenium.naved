package calendar;

import webdrivermanager.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CalendarTask {

    public static WebDriver driver = GetDriver.getInstance();

    @Test()
    public void selectday() {
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 1. Click to open the datepicker
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();

        // 2. Wait until the calendar is visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//table[contains(@class, 'ui-datepicker-calendar')]")));

        // 3. (Optional) Navigate to the correct month/year
        // Example: If you need to go to a future month:
        while (true) {
            WebElement monthYear = driver.findElement(By.className("ui-datepicker-title"));
            String text = monthYear.getText(); // e.g., "November 2025"
            System.out.println("Current calendar: " + text);
            if (text.equals("December 2025")) {
                break;
            }
            // Click ‘Next’ button to go to next month
            driver.findElement(By.xpath("//a[@data-handler='next']")).click();
        }

        // 4. Select the day
        List<WebElement> allDates = driver.findElements(
                By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class, 'ui-datepicker-other-month'))]"));
        for (WebElement cell : allDates) {
            String day = cell.getText();
            if (day.equals("15")) {  // pick 15th of that month
                cell.click();
                break;
            }
        }

        // 5. (Optional) Verify the date in input
        String selected = dateInput.getAttribute("value");
        System.out.println("Selected date: " + selected);
    }
}
