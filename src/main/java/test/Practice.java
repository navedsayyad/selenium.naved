package test;

import webdrivermanager.GetDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public static WebDriver driver = GetDriver.getInstance();

    @Test()
    public void am() {
        driver.get("https://www.amazon.in/");

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("mobiles");
        driver.findElement(By.id("nav-search-submit-button")).click();

        List<WebElement> priceElement = driver.findElements(By.xpath("//span[@class=\"a-price\"]//span[@class=\"a-price-whole\"]"));

        List<WebElement> descriptionlist = driver.findElements(By.xpath("//div[@data-cy=\"title-recipe\"]"));

        List<String> list = new ArrayList<>();

        try {
            for (int i = 0; i <= priceElement.size(); i++) {
                WebElement priceText = priceElement.get(i);
                String price = priceText.getText().replaceAll(",", "");
                //System.out.println(price);
                int pr = Integer.parseInt(price);

                if (pr <= 10000) {
                    WebElement description = descriptionlist.get(i);
                    String desc = description.getText();
                    System.out.println("mobile under 10 :" + desc);
                    //list.add(descriptionlist.get(i).getText());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
