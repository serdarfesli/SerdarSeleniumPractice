package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefEx {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        WebElement addElementButton= driver.findElement(By.xpath("//button[.=\"Add Element\"]"));
        addElementButton.click();
        WebElement deleteButton= driver.findElement(By.xpath("//button[.=\"Delete\"]"));
        boolean expectedDeleteButtonDispayed=true;
        boolean actualDeleteButtonDispayed=deleteButton.isDisplayed();
        if (expectedDeleteButtonDispayed==actualDeleteButtonDispayed){
            System.out.println("deleteButtonDisplayedAfterClick TEST PASSED ");
        }else{
            System.out.println("deleteButtonDisplayedAfterClick TEST FAILED ");
        }

        System.out.println("----------");
        deleteButton.click();


         try {
             deleteButton.isDisplayed();
         }catch (StaleElementReferenceException e){
             System.out.println("Exception thrown due to deleted element");
         }

        if (expectedDeleteButtonDispayed==actualDeleteButtonDispayed){
            System.out.println("deleteButtonDisplayedAfterClick TEST PASSED ");
        }else{
            System.out.println("deleteButtonDisplayedAfterClick TEST FAILED ");
        }
        driver.close();
    }
}
