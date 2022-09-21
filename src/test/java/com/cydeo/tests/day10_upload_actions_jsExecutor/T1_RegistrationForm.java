package com.cydeo.tests.day10_upload_actions_jsExecutor;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_RegistrationForm {

    @Test
    public void registrationFormTest(){
        Faker faker=new Faker();
//        TC#1: Registration form confirmation
//Note: Use JavaFaker OR read from configuration.properties file when possible.
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

//3. Enter first name
        WebElement nameInput= Driver.getDriver().findElement(By.xpath("//input[@name=\"firstname\"]"));
        nameInput.sendKeys(faker.name().firstName());

//4. Enter last name
        WebElement lastNameInput= Driver.getDriver().findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastNameInput.sendKeys(faker.name().lastName());

//5. Enter username
        WebElement username= Driver.getDriver().findElement(By.xpath("//input[@name=\"username\"]"));
       faker.name().username();
        username.sendKeys(faker.name().username().replaceAll(".",""));
        //username.sendKeys(faker.bothify("?###?##???"));
//6. Enter email address
        WebElement email= Driver.getDriver().findElement(By.xpath("//input[@name=\"email\"]"));
        email.sendKeys(faker.internet().emailAddress());

//7. Enter password
        WebElement password= Driver.getDriver().findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys(faker.bothify("#?#?#?#??"));

//8. Enter phone number
        WebElement phoneNumber= Driver.getDriver().findElement(By.xpath("//input[@name=\"phone\"]"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

//9. Select a gender from radio buttons
        WebElement maleRadioBtn= Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        maleRadioBtn.click();

//10.Enter date of birth
        WebElement dateOfBirth= Driver.getDriver().findElement(By.xpath("//input[@name=\"birthday\"]"));
        dateOfBirth.sendKeys(faker.numerify("10/2#/19##"));

//11.Select Department/Office
        WebElement departmentDropDown= Driver.getDriver().findElement(By.xpath("//select[@name=\"department\"]"));
        Select select= new Select(departmentDropDown);
        select.selectByVisibleText("Mayor's Office");

//12.Select Job Title
        WebElement jobDropDown= Driver.getDriver().findElement(By.xpath("//select[@name=\"job_title\"]"));
        Select select1= new Select(jobDropDown);
        select1.selectByIndex(4);

//13.Select programming language from checkboxes
        WebElement javaProgLangCheckbox= Driver.getDriver().findElement(By.xpath("//input[@value=\"java\"]"));
        javaProgLangCheckbox.click();

        WebElement javascriptProgLangCheckbox= Driver.getDriver().findElement(By.xpath("//input[@value=\"javascript\"]"));
        javaProgLangCheckbox.click();

//14.Click to sign up button
        WebElement signUpBtn= Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUpBtn.click();

//15.Verify success message “You’ve successfully completed registration.” is displayed.

        WebElement successMessage= Driver.getDriver().findElement(By.xpath("//p[.=\"You've successfully completed registration!\"]"));
        String expectedSuccessMessage= "You’ve successfully completed registration.";
        String actualSuccessMessage= successMessage.getText();
        Assert.assertEquals(actualSuccessMessage,expectedSuccessMessage);
    }
}
