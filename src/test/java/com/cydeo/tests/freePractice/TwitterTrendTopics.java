package com.cydeo.tests.freePractice;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TwitterTrendTopics extends TestBase {

//

//---it's include browser, env, username, password
//

    @Test
    public void twitterTrendTopicTest() throws InterruptedException {

        //    Step1 ---> Create config.properties file
        Properties properties = new Properties();

        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

// Step2 ---> Go to "https://twitter.com/"
        driver.get("https://twitter.com/");

        // Step3 ---> Click Sign in button
        WebElement signInBtn = driver.findElement(By.xpath("(//span[.='Sign in'])[2]"));
        signInBtn.click();

        //Step4 ---> Enter username and password, using the keys in the config.properties file

        WebElement inputBoxUserName = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        inputBoxUserName.sendKeys(properties.getProperty("username"));

        WebElement nextButton = driver.findElement(By.xpath("(//div[@dir='auto'])[6]"));
        nextButton.click();

        WebElement passWordBox = driver.findElement(By.xpath("//input[@name='password']"));
        passWordBox.sendKeys(properties.getProperty("password") + Keys.ENTER);

        // Step5 ---> list trending topics
        // Step6 ---> Add all trending topics at a List<WebElement>
// Step7 ---> print each trend topic

        List<WebElement> trends = driver.findElements(By.xpath("//div[@data-testid='trend']"));
        ArrayList<String> trendTopics = new ArrayList<>();
        for (WebElement eachtrend : trends) {

            trendTopics.add(eachtrend.getText());

            //System.out.println(eachtrend.getText().substring(eachtrend.getText().indexOf('#'),eachtrend.getText().indexOf(' ')));
        }

            System.out.println("trendTopics = " + trendTopics);


           /* eachtrend.click();
            Thread.sleep(5000);
            WebElement latestBtn = driver.findElement(By.xpath("//a[@href='/search?q=Ecmel&src=trend_click&f=live&vertical=trends']"));
            latestBtn.click();
            Thread.sleep(5000);
            WebElement firstCommentAccountName = driver.findElement(By.xpath("(//div[@data-testid='User-Names']/div[2]/div/div)[1]/a"));
            System.out.println(firstCommentAccountName.getText());
            driver.navigate().back();
            driver.navigate().back();
            trends = driver.findElements(By.xpath("//div[@data-testid='trend']"));*/
        }

    }




// Step8 ---> List accounts that have made last comments on each topic --> use method outside test method


