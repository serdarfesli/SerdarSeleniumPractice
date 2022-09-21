package com.cydeo.base;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
   public WebDriver driver;

    @BeforeMethod
    public void driverSetUp() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
    }

   @AfterMethod
    public void tearDown(){
        driver.quit();
   }
}
