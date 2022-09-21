package com.cydeo.tests.day12_pomDesign_explicitWait;

import com.cydeo.pages.DynamicallyLoadedPage7;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicallyLoadedPageTest {
   DynamicallyLoadedPage7 dynamicallyLoadedPage7;
    @BeforeMethod
    public void Setup(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        dynamicallyLoadedPage7= new DynamicallyLoadedPage7();
    }
    @Test
    public void explicitWaitTest(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        Assert.assertTrue(dynamicallyLoadedPage7.doneText.isDisplayed());
        Assert.assertTrue(dynamicallyLoadedPage7.image.isDisplayed());

Driver.closeDriver();
    }
}
/*
1. Go to https://practice.cydeo.com/dynamic_loading/7
2. Wait until title is “Dynamic title”
3. Assert: Message “Done” is displayed.
4. Assert: Image is displayed.
Note: Follow POM
 */