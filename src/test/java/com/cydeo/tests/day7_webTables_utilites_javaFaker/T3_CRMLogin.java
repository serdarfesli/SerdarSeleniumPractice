package com.cydeo.tests.day7_webTables_utilites_javaFaker;

import com.cydeo.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRMLogin extends TestBase {

    @Test
    public void crm_login_test(){
//1. Create new test and make set ups
//2. Go to : http://login1.nextbasecrm.com/
        driver.get("http://login1.nextbasecrm.com/");

//3. Enter valid username
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInput.sendKeys("helpdesk1@cybertekschool.com");

//4. Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys("UserUser");

//5. Click to `Log In` button
        WebElement loginButton= driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
        BrowserUtils.sleep(3);
//6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"Portal");
//Expected: Portal
    }
}
//        USERNAME PASSWORD

//helpdesk1@cybertekschool.com UserUser
//Helpdesk2@cybertekschool.com UserUser