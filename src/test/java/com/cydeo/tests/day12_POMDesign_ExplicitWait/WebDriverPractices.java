package com.cydeo.tests.day12_POMDesign_ExplicitWait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverPractices {
    @Test
    public void DynamicLoad7Test(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        //2. Wait until title is “Dynamic title”
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        String actual = Driver.getDriver().getTitle();
        String expected = "Dynamic title";
        Assert.assertEquals(actual, expected);

        //3. Assert: Message “Done” is displayed.
       Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

       //4. Assert: Image is displayed.
        wait.until(ExpectedConditions.visibilityOf(dynamicLoad7Page.image));
        Assert.assertTrue(dynamicLoad7Page.image.isDisplayed());

        //Note: Follow POM
    }

    @Test
    public void dynamicLoad1Test(){
        //1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");
        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();
        //2. Click to start
        dynamicLoad1Page.startButton.click();

        //3. Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loading));

        //4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.usernameInput.isDisplayed());

        //5. Enter username: tomsmith
        dynamicLoad1Page.usernameInput.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        dynamicLoad1Page.passwordInput.sendKeys("incorrectpassword");

        //7. Click to Submit button
        dynamicLoad1Page.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicLoad1Page.invalidPasswordErrorMessage.isDisplayed());

        //Note: Follow POM Design Pattern
    }
}
