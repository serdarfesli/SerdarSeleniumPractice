package com.cydeo.tests.freePractice;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKart_WiredHeadPhones extends TestBase {

    @Test
    public void flipKart_WiredHeadPhonesTest(){
//    -  Go to https://www.flipkart.com/
driver.get("https://www.flipkart.com/");
        WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        closeButton.click();

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("(//div[.='Electronics'])[4]"))).build().perform();
                //driver.findElement(By.xpath("(//div[.='Electronics'])[4]")); {


//- Locate Wire Headphones (under Electronics Menu)
        WebElement wiredHeadPhone = driver.findElement(By.xpath("//a[.='Wired Headphones']"));
        wiredHeadPhone.click();
    }

//If you can find the locator you can share it.
}
