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

public class T2_ConfirmationAlertPractice {
    WebDriver driver;

    @BeforeMethod
    public void driverSetUp() {
        //    1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void confirmationAlertTest() {

//2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

//3. Click to “Click for JS Confirm” button
        WebElement JSConfirmButton = driver.findElement(By.xpath("//button[.=\"Click for JS Confirm\"]"));
        JSConfirmButton.click();

//4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

//5. Verify “You clicked: Ok” text is displayed.
        WebElement result = driver.findElement(By.id("result"));
        String expected = "You clicked: Ok";
        String actual = result.getText();
        Assert.assertEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
