package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyHardAssertExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String text = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        Assert.assertEquals(text,"create Rediffmail account","Text Should be matched");
        Assert.assertEquals(text,"create Rediffmail account","Text Should be matched");
        Assert.assertEquals(text,"create Rediffmail account","Text Should be matched");
        System.out.println("Hello");
        driver.close();





    }


}
