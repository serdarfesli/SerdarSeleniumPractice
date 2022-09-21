package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_RadioButton_Cont {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
        List<WebElement> sportradioButtons= driver.findElements(By.xpath("//input[@name=\"sport\"]"));
        for (WebElement sportradioButton : sportradioButtons) {
            if (sportradioButton.getAttribute("id").equals("hockey")){
                sportradioButton.click();
                System.out.println("hockey button is selected" + sportradioButton.isSelected());
            }
        }

        


    }
}
