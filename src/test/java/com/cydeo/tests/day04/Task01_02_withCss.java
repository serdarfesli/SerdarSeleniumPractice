package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task01_02_withCss {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("[class='nav-link']"));
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        WebElement homeLinkVersion2 = driver.findElement(By.cssSelector("[href='/']"));

        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("[class='example']>h2"));
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

         WebElement eMailText = driver.findElement(By.cssSelector("[for='email']"));
         //2. version WebElement eMailText = driver.findElement(By.cssSelector("[class='large-6 small-12 columns']>label"));
        System.out.println("eMailText.isDisplayed() = " + eMailText.isDisplayed());

        WebElement eMailInputBox = driver.findElement(By.cssSelector("[type='text']"));
        WebElement eMailInputBox2ndVersion = driver.findElement(By.cssSelector("[name=\"email\"]"));
        System.out.println("eMailInputBox.isDisplayed() = " + eMailInputBox.isDisplayed());

        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("[id=\"form_submit\"]"));
        WebElement retrievePasswordButton2ndVersion = driver.findElement(By.cssSelector("[class=\"radius\"]"));
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());


        WebElement poweredByCydeoText = driver.findElement(By.cssSelector("[style=\"text-align: center;\"]"));
        WebElement poweredByCydeoText2ndVersion = driver.findElement(By.cssSelector("[class=\"large-4 large-centered columns\"]>div"));
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
//4. Verify all web elements are displayed.

    }

}
