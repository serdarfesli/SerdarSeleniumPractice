package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://google.com");
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        gmailLink.click();
        String expectedPageTitle = "Gmail";
        String actualPageTitle = driver.getTitle();
        if (expectedPageTitle.equals(actualPageTitle)) {
            System.out.println("expectedPageTitle = " + expectedPageTitle);
            System.out.println("actualPageTitle = " + actualPageTitle);
            System.out.println("title test PASSED");
        } else {
            System.out.println("expectedPageTitle = " + expectedPageTitle);
            System.out.println("actualPageTitle = " + actualPageTitle);
            System.err.println("title test FAILED");
        }
        driver.navigate().back();
        expectedPageTitle = "Google";
        actualPageTitle = driver.getTitle();
        if (expectedPageTitle.equals(actualPageTitle)) {
            System.out.println("expectedPageTitle = " + expectedPageTitle);
            System.out.println("actualPageTitle = " + actualPageTitle);
            System.out.println("title test PASSED");
        } else {
            System.out.println("expectedPageTitle = " + expectedPageTitle);
            System.out.println("actualPageTitle = " + actualPageTitle);
            System.err.println("title test FAILED");
        }
        driver.close();
    }
}
