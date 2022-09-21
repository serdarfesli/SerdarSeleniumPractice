package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage7 {

    public DynamicallyLoadedPage7(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//strong")
    public WebElement doneText;

    @FindBy (xpath = "//img")
    public WebElement image;

    @FindBy (xpath = "//h3")
    public WebElement dynamicallyLoadedPageTitle;

    @FindBy (xpath = "//h4")
    public WebElement example7Text;



}
