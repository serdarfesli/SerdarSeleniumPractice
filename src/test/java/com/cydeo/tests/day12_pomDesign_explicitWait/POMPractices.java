package com.cydeo.tests.day12_pomDesign_explicitWait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {
    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();
    }
    @Test
    public void required_field_error_message(){
//        1- Open a chrome browser
//2- Go to: https://library1.cydeo.com

//3- Do not enter any information

        libraryLoginPage.signInButton.click();
//4- Click to “Sign in” button
//5- Verify expected error is displayed:
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMEssage.isDisplayed());
//Expected: This field is required.
//NOTE: FOLLOW POM DESIGN PATTERN
        Driver.closeDriver();
    }

    @Test
    public void invalidEmailFormatErrorMessage() {

        libraryLoginPage.inputUsername.sendKeys("something");
        libraryLoginPage.signInButton.click();

        Assert.assertTrue(libraryLoginPage.validEmailAddressErrorMessage.isDisplayed());

        Driver.closeDriver();
    }
@Test
        public void wrongEmailOrPassword(){

//Enter incorrect username or incorrect password
    libraryLoginPage.inputUsername.sendKeys("sometihn@gmail.com");
    libraryLoginPage.passwordInput.sendKeys("sadasd");
    libraryLoginPage.signInButton.click();
//4- Verify title expected error is displayed:
    Assert.assertEquals(libraryLoginPage.wrongEmailOrPasswordErrorMessage.getText(),"Sorry, Wrong Email or Password");
//Expected: Sorry, Wrong Email or Password

    Driver.closeDriver();
        }


    }

