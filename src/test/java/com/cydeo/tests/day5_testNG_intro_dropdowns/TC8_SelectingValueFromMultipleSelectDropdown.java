package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC8_SelectingValueFromMultipleSelectDropdown {
    WebDriver driver;
    @BeforeMethod
    public void setDriver(){
        driver= WebDriverFactory.getDriver("chrome");
    }
    @Test
    public void multipleDropDownTest(){
        driver.get("https://practice.cydeo.com/dropdown");
        Select multipleDropDown= new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> options = multipleDropDown.getOptions();
        for (WebElement eachoption : options) {
            multipleDropDown.selectByVisibleText(eachoption.getText());
        }
        for (WebElement eachoption : options) {
            if (eachoption.isSelected()){
                System.out.println(eachoption.getText());
            }
        }
        for (WebElement eachoption : options) {
            multipleDropDown.selectByVisibleText(eachoption.getText());
        }
    }

}
