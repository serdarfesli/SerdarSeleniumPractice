package com.cydeo.tests.freePractice;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ironspider_ca extends TestBase {


    @Test
    public void ironSipiderTest() {
//    Step1 ---> Go to "https://www.ironspider.ca/index.htm"
        driver.get("https://www.ironspider.ca/index.htm");

// Step2 ---> Click Web Pages Forms button
        WebElement webPagesFormButton = driver.findElement(By.xpath("//div[.=\"Web Page Forms\"]"));
        webPagesFormButton.click();

// Step3 ---> Click Checkboxes & Radio Buttons button
        WebElement checkboxesRadioButtons = driver.findElement(By.xpath("//a[.='Checkboxes & Radio Buttons']"));
        checkboxesRadioButtons.click();

// Step4 ---> Select all checkboxes
        List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@name='color']"));
        for (WebElement eachCheckBox : allCheckBoxes) {
            eachCheckBox.click();
        }

// Step5 ---> Verify all checkboxes are clickable or not

        for (WebElement each : allCheckBoxes) {
        Assert.assertTrue(each.isEnabled());
        }

    }
}
