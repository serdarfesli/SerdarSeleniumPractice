package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2_ZeroBankHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement header = driver.findElement(By.tagName("h3"));
        String expectedHeader="Log in to ZeroBank";
        String actualHeader=header.getText();
        if (expectedHeader.equals(actualHeader)){
            System.out.println("expectedHeader = " + expectedHeader);
            System.out.println("actualHeader = " + actualHeader);
            System.out.println("Header TEST PASSED");
        }else {
            System.out.println("expectedHeader = " + expectedHeader);
            System.out.println("actualHeader = " + actualHeader);
            System.out.println("Header TEST FAILED");
        }

        driver.close();
    }
}
