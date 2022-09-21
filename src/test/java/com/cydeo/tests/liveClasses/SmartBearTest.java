package com.cydeo.tests.liveClasses;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearTest extends TestBase {
    @Test
    public void smartBearTest() {
//        1. Open browser
//2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

//3. Enter username: “Tester”
        WebElement userNameInput = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        userNameInput.sendKeys("Tester");
        BrowserUtils.sleep(1);
//4. Enter password: “test”
        WebElement passwordInput = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passwordInput.sendKeys("test");
//5. Click to Login button
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        loginButton.click();
//6. Print out count of all the links on landing page
        List<WebElement> links = Driver.getDriver().findElements(By.xpath("//a"));
        System.out.println(links.size());
//7. Print out each link text on this page
        for (WebElement each : links) {
            System.out.println(each.getText());
        }
    }

    @Test
    public void smartBearTest2() {
        //    Mini-Task: CREATE A CLASS à SmartBearUtils
//• Create a method called loginToSmartBear
//• This method simply logs in to SmartBear when you call it.
//• Accepts WebDriver type as parameter



    }


    }

