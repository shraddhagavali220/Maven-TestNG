package testngbasic;

import org.testng.annotations.*;

public class BeforeAndAfterAnnotationExample {
    @BeforeClass
    public void beforeClassExample(){
        System.out.println("Before Class Example");
    }

    @AfterClass
    public void afterClassExample(){
        System.out.println("After Class Example");
    }


    @BeforeMethod
    public void beforeMethodDemo() {
        System.out.println("Before Method Demo");
    }

    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("After Method Demo");
    }

    @Test(enabled = false)
    public void VerifyMethod_1() {
        System.out.println("Verify Method1");
    }

    @Test(groups = {"smoke"})
    public void VerifyMethod_2() {
        System.out.println("Verify Method2");
    }

    @Test
    public void VerifyMethod_3() {
        System.out.println("Verify Method3");
    }
}
