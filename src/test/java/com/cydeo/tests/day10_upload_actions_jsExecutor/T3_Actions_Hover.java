package com.cydeo.tests.day10_upload_actions_jsExecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {
    @Test
    public void hoverTest() {
//    1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers");
//2. Hover over to first image
        WebElement firstImage = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(firstImage).perform();

        //3. Assert: a. “name: user1” is displayed
        WebElement headerimg1 = Driver.getDriver().findElement(By.xpath("//h5[.=\"name: user1\"]"));
        Assert.assertTrue(headerimg1.isDisplayed());

        //b. “view profile” is displayed
        WebElement img1ViewProfile = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[1]"));
        Assert.assertTrue(img1ViewProfile.isDisplayed());

//4. Hover over to second image
        WebElement secondImage = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        actions.moveToElement(secondImage).perform();

//5. Assert: a. “name: user2” is displayed
        WebElement headerimg2 = Driver.getDriver().findElement(By.xpath("//h5[.=\"name: user2\"]"));
        Assert.assertTrue(headerimg2.isDisplayed());

        // b. “view profile” is displayed
        WebElement img2ViewProfile = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[2]"));
        Assert.assertTrue(img2ViewProfile.isDisplayed());

        //6. Hover over to third image
        WebElement thirdImage = Driver.getDriver().findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
        actions.moveToElement(thirdImage).perform();

        //7. Confirm: //a. “name: user3” is displayed
        WebElement headerimg3 = Driver.getDriver().findElement(By.xpath("//h5[.=\"name: user3\"]"));
        Assert.assertTrue(headerimg3.isDisplayed());
//b. “view profile” is displayed
        WebElement img3ViewProfile = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[3]"));
        Assert.assertTrue(img3ViewProfile.isDisplayed());
    }


}
