package com.cydeo.tests.day03_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement rememberMe = driver.findElement(By.cssSelector("[for='USER_REMEMBER']"));
        String expectedRememberMe = "Remember me on this computer";
        String actualRememberMe = rememberMe.getText();
        if (expectedRememberMe.equals(actualRememberMe)) {
            System.out.println("expectedRememberMe = " + expectedRememberMe);
            System.out.println("actualRememberMe = " + actualRememberMe);
            System.out.println("rememberMe TEST PASSED");
        } else {
            System.out.println("expectedRememberMe = " + expectedRememberMe);
            System.out.println("actualRememberMe = " + actualRememberMe);
            System.out.println("rememberMe TEST FAILED");
        }
        Thread.sleep(5000);

        WebElement forgotYourPasswordText = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotYourPasswordText = "Forgot your password?";
        String actualForgotYourPasswordText = forgotYourPasswordText.getText();
        if (expectedForgotYourPasswordText.equals(actualForgotYourPasswordText)) {
            System.out.println("expectedForgotYourPasswordText = " + expectedForgotYourPasswordText);
            System.out.println("actualForgotYourPasswordText = " + actualForgotYourPasswordText);
            System.out.println("forgotYourPasswordText TEST PASSED");
        } else {
            System.out.println("expectedForgotYourPasswordText = " + expectedForgotYourPasswordText);
            System.out.println("actualForgotYourPasswordText = " + actualForgotYourPasswordText);
            System.out.println("forgotYourPasswordText TEST FAILED");
        }

        String expectedForgotPasswordHrefContainsValue = "forgot_password=yes";

        if (forgotYourPasswordText.getAttribute("href").contains(expectedForgotPasswordHrefContainsValue)) {
            System.out.println("ForgotPasswordHrefValue TEST PASSED");
        } else {
            System.out.println("ForgotPasswordHrefValue TEST FAILED");

        }
        driver.close();

    }
}
