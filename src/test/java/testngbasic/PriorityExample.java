package testngbasic;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 'A')
    public void testCaseZ(){
        System.out.println("Test Case Z");
    }
    @Test(groups = {"smoke"})
    public void testCaseM(){
        System.out.println("Test Case M");
    }
    @Test(priority = -80)
    public void testCaseA(){
        System.out.println("Test Case A");
    }
    @Test(priority = 'D')
    public void testCaseV(){
        System.out.println("Test Case V");
    }
    @Test(priority = -40)
    public void testCaseH(){
        System.out.println("Test Case H");
    }
    @Test(priority = -60)
    public void testCaseS(){
        System.out.println("Test Case S");
    }
    @Test(priority = -70)
    public void testCaseD(){
        System.out.println("Test Case D");
    }
}
