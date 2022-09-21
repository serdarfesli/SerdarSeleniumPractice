package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_practice_cydeo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");
        WebElement header= driver.findElement(By.className("page-header"));
        String expectedHeaderName="Registration form";
        if (header.getText().equals(expectedHeaderName)){
            System.out.println("header name test PASSED");
        }else{
            System.out.println("header name test FAILED");
        }

        WebElement firstName= driver.findElement(By.name("firstname"));
        String expectedFirstNamePlaceHolder="first name";
        if (firstName.getAttribute("placeholder").equals(expectedFirstNamePlaceHolder)){
            System.out.println("firstname placeHolder Test PASSED");
        }else {
            System.out.println("firstname placeHolder Test FAILED");
        }
    }
}
