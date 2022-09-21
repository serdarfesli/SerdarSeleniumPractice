package com.cydeo.tests.day2.facebookTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTests {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("title test PASSED");
        } else {
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
            System.err.println("title test FAILED");

        }
        WebElement eMailInputBox = driver.findElement(By.id("email"));
        eMailInputBox.sendKeys("dasdsad");

        WebElement passwordInputBox = driver.findElement(By.id("pass"));
        passwordInputBox.sendKeys("dasdasdfsd" + Keys.ENTER);

        Thread.sleep(10000);
        expectedTitle = "“Log into Facebook";
        actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("title test PASSED");
        } else {
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
            System.err.println("title test FAILED");

        }
    }
}
