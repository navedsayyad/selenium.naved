package excelfilereading;

import org.testng.annotations.Test;

public class DataTestProvider {

    @Test(dataProvider = "Sample", dataProviderClass = DataProviderRavi.class)
    public void testdata(String Test, String Name, String Surname, String Age, String Gender, String Profession) {
        System.out.println(Gender);
    }
}
