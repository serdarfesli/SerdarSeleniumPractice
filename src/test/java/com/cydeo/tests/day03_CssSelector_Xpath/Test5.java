package com.cydeo.tests.day03_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test5 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement loginBox = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        loginBox.sendKeys("incorrect");
        WebElement resetPasswordButton = driver.findElement(By.xpath("//button[@class=\"login-btn\"]"));
        resetPasswordButton.click();
        String expectedErrorLabel = "Login or E-mail not found";
        String actualErrorLabel = driver.findElement(By.xpath("//div[@class=\"errortext\"]")).getText();

        if (expectedErrorLabel.equals(actualErrorLabel)) {
            System.out.println("expectedErrorLabel = " + expectedErrorLabel);
            System.out.println("actualErrorLabel = " + actualErrorLabel);
            System.out.println("ErrorLabel TEST PASSED");
        } else {
            System.out.println("expectedErrorLabel = " + expectedErrorLabel);
            System.out.println("actualErrorLabel = " + actualErrorLabel);
            System.out.println("ErrorLabel TEST FAILED");
        }

        driver.close();

    }
}
