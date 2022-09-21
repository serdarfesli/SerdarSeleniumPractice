package com.cydeo.tests.day8_Properties_Configuration;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T4_GoogleSearch extends TestBase {
    @Test
    public void googleSearchTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("input")+ Keys.ENTER);
        BrowserUtils.verifyTitle(Driver.getDriver(),ConfigurationReader.getProperty("title"));
    }

}
