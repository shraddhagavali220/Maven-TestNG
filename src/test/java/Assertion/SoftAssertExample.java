package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifyHardAssertExample() {
        SoftAssert softAssert = new SoftAssert();

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String text = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        softAssert.assertEquals(text, "Create Rediffmail account", "Text Should be matched");
        WebElement fullNameTextBox = driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        softAssert.assertFalse(fullNameTextBox.isDisplayed(),"full name textbox should be display");
        WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[starts-with(@name,'name')]))[2]"));
        softAssert.assertFalse(femaleRadioBtn.isSelected(),"female radio button should be clickable");
        softAssert.assertAll();
        driver.close();


    }
}
