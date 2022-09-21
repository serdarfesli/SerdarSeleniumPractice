package com.cydeo.tests.freePractice;

import com.cydeo.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class IronSpiderCa_2 extends TestBase {


    @Test
    public void ironSpiderCa_2Test_2() throws InterruptedException {
        //    Step1 ---> Go to "https://www.ironspider.ca/index.htm"
        driver.get("https://www.ironspider.ca/index.htm");

        //    Step2 ---> Click Web Pages Forms button
        WebElement webPagesFormsButton = driver.findElement(By.xpath("//div[.='Web Page Forms']"));
        webPagesFormsButton.click();

//    Step3 ---> Click Dropdown Menus button
        WebElement dropDownMenus = driver.findElement(By.xpath("//a[.='Dropdown Menus']"));
        dropDownMenus.click();

//    Step4 ---> Verify default selected dropdown
//        Expected = "With cream"
        Select select = new Select(driver.findElement(By.xpath("//select[@name='coffee']")));
        String actual= select.getFirstSelectedOption().getText();
        String expected= "With cream";
        Assert.assertEquals(actual,expected);

//    Step5 ---> Select all dropdowns without "With cream"
        List<WebElement> options = select.getOptions();
        for (WebElement eachOption : options) {
                if (!(eachOption.getText().contains("With cream"))){
                    select.selectByVisibleText(eachOption.getText());
                }
                Thread.sleep(3000);
        }
//    Step6 ---> Verify all dropdown is selected
        for (WebElement eachSelectedOption : select.getAllSelectedOptions()) {
            System.out.println(eachSelectedOption.getText());
            Assert.assertTrue(eachSelectedOption.isSelected());
        }

//    Step7 ---> Verify last selected is "Crisp (har har...)"
        String actualLastSelected = select.getFirstSelectedOption().getText();
        System.out.println(actualLastSelected);
        String expectedlastSelected = "Crisp (har har...)";
        Assert.assertEquals(actualLastSelected,expectedlastSelected);
    }

}
