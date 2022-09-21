package com.cydeo.tests.freePractice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Day10_Task6_Revision {
//    1- Open a chrome browser
    @Test
    public void scrollUsingJS(){
//2- Go to: https://practice.cydeo.com/infinite_scroll
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(3);
//a. 750 pixels down 10 times.
        for (int i = 0; i <10 ; i++) {
            js.executeScript("window.scrollBy(0,750)");
            BrowserUtils.sleep(1);
        }
//b. 750 pixels up 10 times
        for (int i = 0; i <10 ; i++) {
            js.executeScript("window.scrollBy(0,-750)");
            BrowserUtils.sleep(1);
        }
    }
//3- Use below JavaScript method and scroll
//JavaScript method to use : window.scrollBy(0,0)

}
