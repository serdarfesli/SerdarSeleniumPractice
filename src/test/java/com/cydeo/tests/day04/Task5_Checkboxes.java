package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task5_Checkboxes {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        Go to http://practice.cydeo.com/checkboxes
        driver.get("http://practice.cydeo.com/checkboxes");
//        2. Confirm checkbox #1 is NOT selected by default
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id=\"box1\"]"));
        boolean expectedCheckbox1Result = false;
        boolean actualCheckbox1Result = checkbox1.isSelected();
        if (expectedCheckbox1Result == actualCheckbox1Result) {
            System.out.println("expectedResult = " + expectedCheckbox1Result);
            System.out.println("actualResult = " + actualCheckbox1Result);
            System.out.println("checkbox1 TEST PASSED");
        } else {
            System.out.println("expectedResult = " + expectedCheckbox1Result);
            System.out.println("actualResult = " + actualCheckbox1Result);
            System.out.println("checkbox1 TEST FAILED");
        }

//        3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id=\"box2\"]"));
        boolean expectedCheckbox2Result = true;
        boolean actualCheckbox2Result = checkbox2.isSelected();
        if (expectedCheckbox2Result == actualCheckbox2Result) {
            System.out.println("expectedCheckbox2Result = " + expectedCheckbox2Result);
            System.out.println("actualCheckbox2Result = " + actualCheckbox2Result);
            System.out.println("checkbox2 TEST PASSED");
        } else {
            System.out.println("expectedCheckbox2Result = " + expectedCheckbox2Result);
            System.out.println("actualCheckbox2Result = " + actualCheckbox2Result);
            System.out.println("checkbox2 TEST FAILED");
        }

//        4. Click checkbox #1 to select it.
        checkbox1.click();

//        5. Click checkbox #2 to deselect it.
        checkbox2.click();

        System.out.println("After Selecting operations ----------------------------");
//        6. Confirm checkbox #1 is SELECTED.
        expectedCheckbox1Result = true;
        actualCheckbox1Result = checkbox1.isSelected();
        if (expectedCheckbox1Result == actualCheckbox1Result) {
            System.out.println("expectedResult = " + expectedCheckbox1Result);
            System.out.println("actualResult = " + actualCheckbox1Result);
            System.out.println("checkbox1 TEST PASSED");
        } else {
            System.out.println("expectedResult = " + expectedCheckbox1Result);
            System.out.println("actualResult = " + actualCheckbox1Result);
            System.out.println("checkbox1 TEST FAILED");
        }
//        7. Confirm checkbox #2 is NOT selected.
        expectedCheckbox2Result = false;
        actualCheckbox2Result = checkbox2.isSelected();
        if (expectedCheckbox2Result == actualCheckbox2Result) {
            System.out.println("expectedCheckbox2Result = " + expectedCheckbox2Result);
            System.out.println("actualCheckbox2Result = " + actualCheckbox2Result);
            System.out.println("checkbox2 TEST PASSED");
        } else {
            System.out.println("expectedCheckbox2Result = " + expectedCheckbox2Result);
            System.out.println("actualCheckbox2Result = " + actualCheckbox2Result);
            System.out.println("checkbox2 TEST FAILED");
        }

        driver.close();

    }
}
