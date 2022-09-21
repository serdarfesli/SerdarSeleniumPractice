package com.cydeo.tests.liveClasses;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartBearTest2 {
    @Test
    public void smartBearTest3() {
//1. Open browser
//2. Go to website:
//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3. Enter username: “Tester”
//4. Enter password: “test”
//5. Click on Login button
        SmartBearUtils.loginToSmartBear();
//6. Click on Order

        WebElement orderButton = Driver.getDriver().findElement(By.xpath("//a[.='Order']"));
        orderButton.click();

//7. Select familyAlbum from product, set quantity to 2
        Select productDropDown = new Select(Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        productDropDown.selectByVisibleText("FamilyAlbum");

        WebElement quantityInput = Driver.getDriver().findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        quantityInput.sendKeys("2");

//8. Click to “Calculate” button
        WebElement calculateBtn = Driver.getDriver().findElement(By.xpath("//input[@value='Calculate']"));
        calculateBtn.click();

//9. Fill address Info with JavaFaker //• Generate: name, street, city, state, zip code
        Faker faker = new Faker();
        WebElement nameInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        nameInput.sendKeys(faker.name().fullName());
        WebElement streetInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        streetInput.sendKeys(faker.address().streetAddress());
        WebElement cityInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        cityInput.sendKeys(faker.address().city());
        WebElement stateInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4"));
        stateInput.sendKeys(faker.address().state());
        WebElement zipCodeInput = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zipCodeInput.sendKeys(faker.numerify("#########"));


//10.Click on “visa” radio button
        WebElement visaRadioBtn = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaRadioBtn.click();
//11.Generate card number using JavaFaker
        WebElement creditCardNumber = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        creditCardNumber.sendKeys(faker.numerify("################"));
//11.Generate expire date using JavaFaker
        WebElement expireDate = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expireDate.sendKeys(faker.numerify("##/##"));

//12.Click on “Process”
        WebElement processBtn = Driver.getDriver().findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        processBtn.click();
//13.Verify success message “New order has been successfully added.”
        WebElement newOrderText = Driver.getDriver().findElement(By.xpath("//strong"));
        Assert.assertEquals(newOrderText.getText(),"New order has been successfully added.");
    }
}

