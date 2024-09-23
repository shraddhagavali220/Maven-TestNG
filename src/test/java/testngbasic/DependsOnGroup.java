package testngbasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = {"smoke"})
    public void verifyAddToCard(){
        Assert.assertTrue(false);
        System.out.println("verify Add To Card");
    }
    @Test(dependsOnGroups = {"smoke"})
    public void verifyOrder(){
        System.out.println("Verify Order");
    }
    @Test
    public void verifyPayment(){
        System.out.println("Verify Payment");
    }
}
