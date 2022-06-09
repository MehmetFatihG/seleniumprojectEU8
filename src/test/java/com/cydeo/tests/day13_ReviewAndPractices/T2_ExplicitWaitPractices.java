package com.cydeo.tests.day13_ReviewAndPractices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void explicitWaitsTest(){
        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        //to not use implicit and explicit wait at the same time.
        /*Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));*/
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);


        //5- Verify:
        //a. Checkbox is not displayed
        try{
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }
        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.goneMessage.isDisplayed());
        //NOTE: FOLLOW POM
    }

    @Test
    public void enableButton(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        //3- Click to “Enable” button
        dynamicControlsPage.enableButton.click();

        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputEnable.isEnabled());
        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.itIsEnabledMessage.isDisplayed());
        //NOTE: FOLLOW POM
    }
}
