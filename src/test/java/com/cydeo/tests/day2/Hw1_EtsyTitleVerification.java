package com.cydeo.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1_EtsyTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.etsy.com");
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);
        String expectedPageTitle= "Wooden spoon | Etsy";
        String actualPageTitle=driver.getTitle();
        if (actualPageTitle.equals(expectedPageTitle)){
            System.out.println("expectedPageTitle = " + expectedPageTitle);
            System.out.println("actualPagaTitle = " + actualPageTitle);
            System.out.println("page Title test PASSED");
        }else {
            System.out.println("expectedPageTitle = " + expectedPageTitle);
            System.out.println("actualPageTitle = " + actualPageTitle);
            System.out.println("page Title test FAILED");
        }
        driver.close();
    }
}
