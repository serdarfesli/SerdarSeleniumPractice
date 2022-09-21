package com.cydeo.tests.freePractice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day10Task2Revision {

    @Test
    public void uploadTest(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        WebElement chooseFileBtn= Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        chooseFileBtn.sendKeys("C:\\Users\\123\\Desktop\\SORU YAZMA GÖRSEL\\ananas.png");

        WebElement uploadBtn= Driver.getDriver().findElement(By.id("file-submit"));
        uploadBtn.click();
        WebElement fileUploadedMessage= Driver.getDriver().findElement(By.xpath("//h3[text()='File Uploaded!']"));
        Assert.assertTrue(fileUploadedMessage.isDisplayed());




    }
}
