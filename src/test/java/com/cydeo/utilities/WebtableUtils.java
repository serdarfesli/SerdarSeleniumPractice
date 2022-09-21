package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebtableUtils {
// Return type: String
// Arg1: WebDriver driver
// Arg2: String costumerName
//This method should accept a costumerName and return the costumer order date as a String.

    public static String returnOrderDate(WebDriver driver, String costumerName) {
        driver.get("https://practice.cydeo.com/web-tables");

        WebElement customerOrderDateCell = driver.findElement(By.xpath("//td[.='" + costumerName + "']/following-sibling::td[3]"));
        String customerOrderDate = customerOrderDateCell.getText();
        return customerOrderDate;
    }

    public static void orderVerify(WebDriver driver,String costumerName,String expectedOrderDate){
            driver.get("https://practice.cydeo.com/web-tables");

            WebElement customerOrderDateCell = driver.findElement(By.xpath("//td[.='" + costumerName + "']/following-sibling::td[3]"));
            String actualOrderDate = customerOrderDateCell.getText();
            Assert.assertEquals(actualOrderDate,expectedOrderDate);
    }
}
//Name: orderVerify ()
//• Return type: void
//• Arg1: WebDriver driver
//• Arg2: String costumerName
//• Arg3: String expectedOrderDate
//This method should accept above mentioned arguments and internally assert
//expectedOrderDate matching actualOrderDate.