package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_WindowsHandling {
    WebDriver driver;

    @BeforeMethod
    public void driverSetUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }


    @Test
    public void multipleWindowTest() {
//        3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

//        4. Assert: Title is “Windows”
        String expected = "Windows";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);


//        5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();



//        6. Switch to new Window.

        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("current title while switchng windows: " + driver.getTitle());
        }


//        7. Assert: Title is “New Window”
        String expectedTitle = "New Window";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println("title after click " + actualTitle);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
/*


 */