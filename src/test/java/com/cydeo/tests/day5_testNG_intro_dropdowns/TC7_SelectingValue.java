package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7_SelectingValue {
    WebDriver driver;
    @BeforeMethod
    public void setDriver(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @Test
    public void selectValueTest(){
        driver.get("https://practice.cydeo.com/dropdown");
        WebElement dropdownLink= driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        dropdownLink.click();
        WebElement facebookDropdownLink= driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookDropdownLink.click();
        String actual=driver.getTitle();
        String expected="Facebook - Log In or Sign Up";
        Assert.assertEquals(actual,expected);


    }



}
