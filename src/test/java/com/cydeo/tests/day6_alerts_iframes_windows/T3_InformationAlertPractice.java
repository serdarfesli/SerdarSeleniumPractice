package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_InformationAlertPractice {
    WebDriver driver;

    @BeforeMethod
    public void driverSetUp() {
        //    1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void promptinformationAlertTest() {

//2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

//3. Click to “Click for JS Prompt” button
        WebElement JSPromptButton = driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]"));
        JSPromptButton.click();

//4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
//5. Click to OK button from the alert
        alert.accept();

//6. Verify “You entered: hello” text is displayed
        WebElement result = driver.findElement(By.id("result"));
        String expected = "You entered: hello";
        String actual = result.getText();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
