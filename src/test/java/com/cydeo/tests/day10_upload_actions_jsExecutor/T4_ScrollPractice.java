package com.cydeo.tests.day10_upload_actions_jsExecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_ScrollPractice {
    @Test
    public void scrollPractice() {
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//div[text()=\"Powered by \"]"));
//4- Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(poweredByCydeo).perform();

        //5- Continue from where the Task 4 is left in the same test.
//6- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.HOME).perform();












        /*//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");
        BrowserUtils.sleep(3);
//3- Scroll down to “Powered by CYDEO”
//4- Scroll using Actions class “moveTo(element)” method
        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//div[text()='Powered by ']"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(poweredByCydeo).perform();
        BrowserUtils.sleep(3);
//5- Continue from where the Task 4 is left in the same test.
//6- Scroll back up to “Home” link using PageUP button
        for (int i = 0; i < 3; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();*/
        }
    }

