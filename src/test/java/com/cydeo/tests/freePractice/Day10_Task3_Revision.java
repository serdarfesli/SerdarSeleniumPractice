package com.cydeo.tests.freePractice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day10_Task3_Revision {
    @Test
    public void hoverTest(){
//1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
//2. Hover over to first image
//3. Assert: a. “name: user1” is displayed b. “view profile” is displayed
        Actions actions= new Actions(Driver.getDriver());
        WebElement firstImage = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        actions.moveToElement(firstImage).perform();
        WebElement user1text = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user1ViewProfileText = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[1]"));
        Assert.assertTrue(user1text.isDisplayed());
        Assert.assertTrue(user1ViewProfileText.isDisplayed());

//4. Hover over to second image
        WebElement secondImage = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        actions.moveToElement(secondImage).perform();
        WebElement user2text = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user2ViewProfileText = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[2]"));
        Assert.assertTrue(user2text.isDisplayed());
        Assert.assertTrue(user2ViewProfileText.isDisplayed());
//5. Assert:
//a. “name: user2” is displayed
//b. “view profile” is displayed
//6. Hover over to third image
        WebElement thirdImage = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
        actions.moveToElement(thirdImage).perform();
        WebElement user3text = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));
        WebElement user3ViewProfileText = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[3]"));
        Assert.assertTrue(user3text.isDisplayed());
        Assert.assertTrue(user3ViewProfileText.isDisplayed());
//7. Confirm:
//a. “name: user3” is displayed
//b. “view profile” is displayed

    }
}
