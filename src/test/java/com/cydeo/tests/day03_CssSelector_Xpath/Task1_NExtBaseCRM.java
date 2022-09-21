package com.cydeo.tests.day03_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1_NExtBaseCRM {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement usernameBox = driver.findElement(By.name("USER_LOGIN"));
        usernameBox.sendKeys("“incorrect”");

        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys("“incorrect”");

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        String expectedErrorMessage = "Incorrect login or password";
        WebElement errorMesage = driver.findElement(By.className("errortext"));
        String actualErrorMessage = errorMesage.getText();

        if (expectedErrorMessage.equals(actualErrorMessage)) {
            System.out.println("Error Message Test PASSED");
        } else {
            System.out.println("Error Message Test FAILED");
        }
        driver.close();
    }
}
