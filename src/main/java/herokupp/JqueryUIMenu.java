package herokupp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryUIMenu {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/jqueryui/menu");




       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions actions = new Actions(driver);

        // Locate the top‐level menu item (Enabled)
        WebElement menuEnabled = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[text()='Enabled']")));

        // Hover on the menu to reveal sub‐menu
        actions.moveToElement(menuEnabled).perform();

        // Then locate "Downloads" sub-menu item
        WebElement menuDownloads = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[text()='Downloads']")));

        // Hover over Downloads
        actions.moveToElement(menuDownloads).perform();

        // Then select one of the leaf items (e.g., Excel)
        WebElement menuExcel = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[text()='Excel']")));

        // Click on the leaf item
        menuExcel.click();

        // You can assert something, e.g., that the click triggered a download or navigated somewhere
        System.out.println("Clicked on Excel menu item.");

    } finally {
        // Clean up
        driver.quit();*/
    }
}
