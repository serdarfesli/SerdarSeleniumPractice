package com.cydeo.tests.liveClasses;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3 {
    //    TC#3: Smartbear software order verification
//1. Open browser and login to Smartbear software
    @Test
    public void test3() {
        SmartBearUtils.loginToSmartBear();

//2. Click on View all orders
        WebElement viewAllOrders = Driver.getDriver().findElement(By.xpath("//a[.='View all orders']"));

//3. Verify Susan McLaren has order on date “01/05/2010
        WebElement SusanMaclarenDate = Driver.getDriver().findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));
        String actual = SusanMaclarenDate.getText();
        String expected = "01/05/2010";
        Assert.assertEquals(actual,expected);
    }
}
