package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task01_02_XPath {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");
        WebElement homeLink = driver.findElement(By.xpath("//a[@class=\"nav-link\"]"));
        WebElement homeLink2ndVersion = driver.findElement(By.xpath("//a[.='Home']")); //text of the tag
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());


        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());

        WebElement eMailText = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        WebElement eMailText2ndVersion = driver.findElement(By.xpath("//label[.='E-mail']"));//by tag text
        System.out.println("eMailText.isDisplayed() = " + eMailText.isDisplayed());

        WebElement eMailInputBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        WebElement eMailInputBox2ndVersion = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        System.out.println("eMailInputBox.isDisplayed() = " + eMailInputBox.isDisplayed());

        WebElement retrievePasswordButton = driver.findElement(By.xpath("//i[@class=\"icon-2x icon-signin\"]"));
        WebElement retrievePasswordButton2ndVersion = driver.findElement(By.xpath("//i[.='Retrieve password']"));//by tag text
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());


        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        WebElement poweredByCydeoText2ndVersion = driver.findElement(By.xpath("//div[@class=\"large-4 large-centered columns\"]/div"));
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());
//4. Verify all web elements are displayed.










    }
}
