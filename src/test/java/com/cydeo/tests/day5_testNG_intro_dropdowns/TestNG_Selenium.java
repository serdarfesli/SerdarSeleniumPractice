package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Selenium {
    @BeforeClass
    public void setUp(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
    }
    @Test
    public void selenium_test(){



    }
}
