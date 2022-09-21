package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RadioButton_Handling {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id=\"hockey\"]"));
        hockeyRadioBtn.click();
        boolean expectedSelectedResult = true;
        boolean actualSelectedResult = hockeyRadioBtn.isSelected();
        if (expectedSelectedResult == actualSelectedResult) {
            System.out.println("hockeyRadioBtn TEST PASSED");
        } else {
            System.out.println("hockeyRadioBtn TEST FAILED");
        }
        driver.close();
    }
}
