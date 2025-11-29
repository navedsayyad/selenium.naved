package test;

import Utilities.FailRetry;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

    SoftAssert softAssert = new SoftAssert();

    @Test(retryAnalyzer = FailRetry.class)
    public void AssertMet() {
        softAssert.assertEquals("Naved", "Ravi");
        System.out.println("The line is executed with soft assertion ");
        softAssert.assertEquals(1, 4);
        System.out.println("Again line is executed with soft assertion");
        softAssert.assertAll();

        // Hard Assert
        // Assert.assertEquals("Naved", "Ravi");
        // System.out.println("Failed ");
    }
}
