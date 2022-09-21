package com.cydeo.tests.day8_Properties_Configuration;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_WebTablePractice extends TestBase {
    @Test
    public void webTablesTest() {
//1.  Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

//     2.  Verify Bob’s name is listed as expected.
//           Expected: “Bob Martin”
        WebElement bobMartinName = driver.findElement(By.xpath("//td[.='Bob Martin']"));
        String expectedName="Bob Martin";
        String actualName= bobMartinName.getText();
        Assert.assertEquals(actualName,expectedName);

//     3.  Verify Bob Martin’s order date is as expected
//           Expected: 12/31/2021
        WebElement bobMartinOrderDate = driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));
        String expectedDate="12/31/2021";
        String actualDate= bobMartinOrderDate.getText();
        Assert.assertEquals(actualDate,expectedDate);
    }

}
