package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_StateDropDown {
    WebDriver driver;
    @BeforeMethod
    public void setUpDriver(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @Test
    public void stateDropDownTest(){
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select stateDropDown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropDown.selectByVisibleText("Illinois");
        stateDropDown.selectByValue("VA");
        stateDropDown.selectByIndex(5);
        String expected="California";
        String actual=stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,expected);



    }

}
