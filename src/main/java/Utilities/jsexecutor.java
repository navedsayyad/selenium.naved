package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.Testngpractice;

public class jsexecutor extends Testngpractice {
    public WebElement scrollToElement(WebDriver driver, WebElement destination){

            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

            javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", destination);
            return destination;
    }
}
