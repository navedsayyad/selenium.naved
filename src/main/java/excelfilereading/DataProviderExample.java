package excelfilereading;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
                {"admin1", "admin123"},
                {"admin2", "admin234"},
                {"admin3", "admin345"}
        };
    }

    @Test(dataProvider = "loginData")
    public void LoginTest(String username, String password) {
        System.out.println("username : " + username + " password : " + password);
    }
}
