package com.cydeo.tests.day10_upload_actions_jsExecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_ScrollPractice {
    @Test
    public void scrollWithJS(){
        Driver.getDriver().get("https://practice.cydeo.com/large");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement poweredByCydeo = Driver.getDriver().findElement(By.xpath("//div[text()='Powered by ']"));
        js.executeScript( "arguments[0].scrollIntoView(true)",poweredByCydeo);


    }
}
