package com.cydeo.tests.day11;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC7FromPreviousDay {
    @Test
    public void scrollTest() {
        Driver.getDriver().get("https://practice.cydeo.com/large");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement cydeo = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement home = Driver.getDriver().findElement(By.linkText("Home"));
        js.executeScript("arguments[0].scrollIntoView(true)", cydeo);
        BrowserUtils.sleep(2);
        js.executeScript("arguments[1].scrollIntoView(true)", cydeo,home);


    }
}
