package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/*
in this class only general utiliy methods that are not related to some specific page.
 */
public class BrowserUtils {
    public static void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle) {
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));
    }

   public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
   }
}
