package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv {

    @DataProvider(name = "userlogindata")
    public Object[][] getdata() {
        return new Object[][]{
                {"Scott", 39},
                {"Evan", 37}
        };
    }

    @Test(dataProvider = "userlogindata")
    public void usertest(String name, int age){
        System.out.println("name " + name + "age " + age);
    }

}

