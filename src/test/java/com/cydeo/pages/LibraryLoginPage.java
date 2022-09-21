package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    public LibraryLoginPage() {
      PageFactory.initElements(Driver.getDriver(), this);
    }

  @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername ;


   @FindBy(id = "inputPassword")
    public WebElement passwordInput;


    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

   @FindBy(id = "inputEmail-error")
    public WebElement fieldRequiredErrorMEssage;

   @FindBy (xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement validEmailAddressErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;





}
