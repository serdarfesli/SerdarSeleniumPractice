package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library1.cydeo.com/login.html");
        WebElement inputEmailAdress= driver.findElement(By.className("form-control"));
       String username= "incorrect@email.com";
        inputEmailAdress.sendKeys(username);
        Thread.sleep(5000);

        WebElement inputPassword= driver.findElement(By.id("inputPassword"));
        inputPassword.sendKeys("incorrect password");

        WebElement signInButton=driver.findElement(By.tagName("button"));
        signInButton.click();

        WebElement errorMessage= driver.findElement(By.className("alert alert-danger"));
        if (errorMessage.getText().equals("Sorry, Wrong Email or Password")){
            System.out.println("error message test PASSED");
        }else{
            System.out.println("error message test FAILED");
        }

//        1. Open Chrome browser
//        2. Go to https://library1.cydeo.com/login.html
//        3. Enter username: “incorrect@email.com”
//        4. Enter password: “incorrect password”
//        5. Verify: visually “Sorry, Wrong Email or Password”
//        displayed
//        PS: Locate username input box using “className” locator
//        Locate password input box using “id” locator
//        Locate Sign in button using “tagName” locator
    }
}
