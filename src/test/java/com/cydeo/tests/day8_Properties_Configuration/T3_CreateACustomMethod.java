package com.cydeo.tests.day8_Properties_Configuration;

import com.cydeo.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class T3_CreateACustomMethod extends TestBase {
    @Test
    public static void getTableGetEmail(WebDriver driver,String tableNum,String firstName) {
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/tables
            driver.get("https://practice.cydeo.com/tables");
    }

}
//3- Write custom method:
//• Method name: getTableGetEmail()
//• Return type: void
//• Arg1: WebDriver driver
//• Arg2: String tableNum
//• Arg3: String firstName