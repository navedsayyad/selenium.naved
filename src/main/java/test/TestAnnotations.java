package test;

import org.testng.annotations.Test;

public class TestAnnotations {

    @Test(groups = "Smoke")
    public void a(){
        System.out.println("A");
    }

    @Test(groups = "Smoke")
    public void b(){
        System.out.println("B");
    }

    @Test(groups = "Regression")
    public void c(){
        System.out.println("C");
    }

    @Test(timeOut = -1)
    public void d(){
        System.out.println("D");
    }

    @Test(description = "Executing E method")
    public void e(){
        System.out.println("E");
    }

    @Test
    public void f(){
        System.out.println("F");
    }
}
