package com.cydeo.tests.day03_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_locatingWithCss {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement loginButtonText= driver.findElement(By.cssSelector("[value='Log In']"));
        String expectedLoginButtonText="Log In";
        String actualLoginButtonText=loginButtonText.getAttribute("value");
        if (expectedLoginButtonText.equals(actualLoginButtonText)){
            System.out.println("expectedLoginButtonText = " + expectedLoginButtonText);
            System.out.println("actualLoginButtonText = " + actualLoginButtonText);
            System.out.println("loginBox TEST PASSED");
        }else {
            System.out.println("expectedLoginButtonText = " + expectedLoginButtonText);
            System.out.println("actualLoginButtonText = " + actualLoginButtonText);
            System.out.println("loginBox TEST FAILED");
        }
        driver.close();
    }
}
