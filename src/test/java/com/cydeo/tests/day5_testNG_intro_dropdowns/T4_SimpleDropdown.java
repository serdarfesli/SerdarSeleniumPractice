package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_SimpleDropdown {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void simpleDropDownTest() {
        driver.get("https://practice.cydeo.com/dropdown");
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        Assert.assertEquals(simpleDropDown.getFirstSelectedOption().getText(), "Please select an option");
    }

    @Test
    public void stateSelectionTest() {
        driver.get("https://practice.cydeo.com/dropdown");
        Select stateSelectionDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Assert.assertEquals(stateSelectionDropDown.getFirstSelectedOption().getText(), "Select a State");
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
