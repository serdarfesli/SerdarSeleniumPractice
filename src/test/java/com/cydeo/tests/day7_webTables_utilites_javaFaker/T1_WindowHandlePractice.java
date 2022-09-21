package com.cydeo.tests.day7_webTables_utilites_javaFaker;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T1_WindowHandlePractice extends TestBase {

    //    1. Create new test and make set ups
    @Test
    public void windowsHandleTest() throws InterruptedException {
//2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");

//3. Copy paste the lines from below into your class

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");

        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");

        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
//4. Create a logic to switch to the tab where Etsy.com is open

        BrowserUtils.verifyTitle(driver,"Facebook");
    }

//These lines will simply open new tabs using something called JavascriptExecutor
//and get those pages. We will learn JavascriptExecutor later as well.
}
