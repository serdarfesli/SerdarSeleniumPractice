package com.cydeo.tests.day03_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("[value='Reset password']"));
        String expectedresetPasswordButtonText = "Reset password";
        String actualresetPasswordButtonText = resetPasswordButton.getText();

        if (expectedresetPasswordButtonText.equals(actualresetPasswordButtonText)) {
            System.out.println("expectedresetPasswordButtonText = " + expectedresetPasswordButtonText);
            System.out.println("actualresetPasswordButtonText = " + actualresetPasswordButtonText);
            System.out.println("resetPasswordButtonText TEST PASSED");
        } else {
            System.out.println("expectedresetPasswordButtonText = " + expectedresetPasswordButtonText);
            System.out.println("actualresetPasswordButtonText = " + actualresetPasswordButtonText);
            System.out.println("resetPasswordButtonText TEST FAILED");
        }

        driver.close();

    }
}
