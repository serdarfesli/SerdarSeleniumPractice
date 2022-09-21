package com.cydeo.tests.liveClasses;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {
    public  static  void loginToSmartBear(){

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

    }
}
