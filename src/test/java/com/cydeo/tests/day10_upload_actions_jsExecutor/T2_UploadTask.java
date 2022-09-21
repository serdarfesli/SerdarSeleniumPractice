package com.cydeo.tests.day10_upload_actions_jsExecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadTask {
    @Test
    public void uploadTest() {
// 1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        WebElement chooseFile= Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

        //2. Find some small file from your computer, and get the path of it.
        String path="C:\\Users\\123\\Desktop\\HTML Class\\barcelona.png";

        //3. Upload the file.
        chooseFile.sendKeys(path);
        WebElement uploadBtn= Driver.getDriver().findElement(By.xpath("//input[@id='file-submit']"));
            uploadBtn.click();

//4. Assert:File uploaded text is displayed on the page
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']")).
                        getText().equals("File Uploaded!"));

    }
}
