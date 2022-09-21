package com.cydeo.tests.day11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {
    @Test
    public void dragDropPractice (){
//        1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
//2. Drag and drop the small circle to bigger circle.
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(Driver.getDriver().findElement(By.id("draggable")),Driver.getDriver().findElement(By.id("droptarget") )).perform();
//3. Assert:
//-Text in big circle changed to: “You did great!”



    }
}
