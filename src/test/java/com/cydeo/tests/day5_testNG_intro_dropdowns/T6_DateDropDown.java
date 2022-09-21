package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T6_DateDropDown {
    WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void dateDropDownTest() {
        driver.get("https://practice.cydeo.com/dropdown");
        Select dateYearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        dateYearDropdown.selectByVisibleText("1923");
        String expected = "1923";
        String actual = dateYearDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected);

        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByIndex(11);
        expected = "December";
        actual = monthDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected);

        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropdown.selectByValue("1");
        expected = "1";
        actual = dayDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected);
    }

}
