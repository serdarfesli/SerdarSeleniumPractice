package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_IFrame {
   WebDriver driver;
    @BeforeMethod
    public void driverSetUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @Test
    public void iFrameTest(){
        driver.get("https://practice.cydeo.com/iframe");
       // WebElement iframe= driver.findElement(By.xpath("//iframe[@id=\"mce_0_ifr\"]"));
        //driver.switchTo().frame(iframe);
      // driver.switchTo().frame(0);
driver.switchTo().frame("mce_0_ifr");

        WebElement iFrameText = driver.findElement(By.xpath("//p[.=\"Your content goes here.\"]"));
        Assert.assertTrue(iFrameText.isDisplayed());

        driver.switchTo().parentFrame();
        WebElement header = driver.findElement(By.xpath("//h3[.=\"An iFrame containing the TinyMCE WYSIWYG Editor\"]"));
            String expectedText="An iFrame containing the TinyMCE WYSIWYG Editor";
            String actaulText=header.getText();
            Assert.assertEquals(actaulText,expectedText);
    }
}
/*
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */