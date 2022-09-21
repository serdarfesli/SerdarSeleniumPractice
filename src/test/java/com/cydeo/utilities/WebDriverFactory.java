package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
        if (browserType.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            WebDriver chromeDriver= new ChromeDriver();
            chromeDriver.manage().window().maximize();
            chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         return chromeDriver;
        }
        if (browserType.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            WebDriver firefoxDriver= new FirefoxDriver();
            firefoxDriver.manage().window().maximize();
            firefoxDriver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            return firefoxDriver;
        }

        return null;
    }
}
