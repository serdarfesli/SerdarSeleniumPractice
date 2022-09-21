package com.cydeo.tests.liveClasses;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementPractice {
    @Test
    public void numberOfLinks() {

//        1. Open Chrome browser 2. Go to https://www.openxcell.com
        Driver.getDriver().get("https://www.openxcell.com");
//3. Count the number of the links on the page and verify
        List<WebElement> links = Driver.getDriver().findElements(By.tagName("a"));
        System.out.println(links.size());
        Assert.assertEquals(links.size(), 338);
//Expected: 332

//3. Print out all of the texts of the links on the page
        int count=0;
        for (WebElement each : links) {
            try {
                if (each.getText().isBlank()) {
                    count++;
                }
            } catch (StaleElementReferenceException e) {
                e.printStackTrace();
            }
        }
        System.out.println("count = " + count);

    }
}

