package prepost;

import org.testng.annotations.*;

public class BeforeAndAfter {


    @AfterSuite(groups = "Smoke")
    public void iAmAfterSuite(){
        System.out.println("After Suite");
    }

    @BeforeSuite(groups = "Smoke")
    public void iAmBeforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void iAmBeforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void iAmAfterTest(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void iAmBeforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public void iAmAferClass(){
        System.out.println("After Class");
    }

    public void testPrint(){
        System.out.println("Naved");
    }

}
