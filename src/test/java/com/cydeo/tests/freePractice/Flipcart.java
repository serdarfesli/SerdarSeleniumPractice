package com.cydeo.tests.freePractice;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipcart  {
    public WebDriver driver;

    @BeforeMethod
    public void driverSetUp() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
    }

    @Test
    public void flipKartTest() {
        // TC1_Step_1 -  Go to  https://www.flipkart.com/
        driver.get("https://www.flipkart.com/");

        WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
closeButton.click();
        // TC1_Step_2 -  Click on the search box
        WebElement seacrhBox = driver.findElement(By.xpath("//input[@class='_3704LK']"));
               seacrhBox.sendKeys("tshirt"+ Keys.ENTER);




    }

}
