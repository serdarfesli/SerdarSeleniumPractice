package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_InformationAlertPractice extends TestBase {


    @Test
    public void informationAlertTest() {
//        1. Open browser
//        2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

//        3. Click to “Click for JS Alert” button
        WebElement jSAlertButton = driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]"));
        jSAlertButton.click();

//        4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

//        5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.id("result"));
        String actualText = resultText.getText();
        String expectedText = "You successfully clicked an alert";
        Assert.assertEquals(actualText, expectedText);

    }
}
