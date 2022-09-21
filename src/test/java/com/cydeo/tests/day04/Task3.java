package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://practice.cydeo.com/multiple_buttons");
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick=\"button1()\"]"));
        button1.click();
        WebElement resultButton = driver.findElement(By.xpath("//p[@id=\"result\"]"));

        String expectedResultButtonText="Clicked on button one!";
        String actualResultButtonText=resultButton.getText();
        if (expectedResultButtonText.equals(actualResultButtonText)){
            System.out.println("resultButton TEST PASSED");
        }else  {
            System.out.println("resultButton TEST FAILED");
        }
        driver.close();
    }
}
