package com.cydeo.tests.day12_POMDesign_ExplicitWait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;
    @BeforeMethod
    public void setup(){
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();
    }

    @Test
    public void requiredFieldErrorMessageTest(){
        //TC #1: Required field error message test
        //3- Do not enter any information
        //4- Click to “Sign in” button
        libraryLoginPage.signInButton.click();

        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        String expected = "This field is required.";
        String actual = libraryLoginPage.fieldRequiredErrorMessage.getText();
        Assert.assertEquals(actual,expected);
        //NOTE: FOLLOW POM DESIGN PATTERN
        Driver.closeDriver();

    }

    @Test
    public void invalidEmailFormatErrorMessageTest(){
        //TC #2: Invalid email format error message test
        //3- Enter invalid email format
        libraryLoginPage.inputEmail.sendKeys("uieaueia");
        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
        //NOTE: FOLLOW POM DESIGN PATTERN
        Driver.closeDriver();
    }

    @Test
    public void libraryNegativeLoginTest(){
        //TC #3: Library negative login
        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputEmail.sendKeys("uieaueia@ueia.com");
        libraryLoginPage.inputPassword.sendKeys("456987456");
        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailorPasswordErrorMessage.isDisplayed());
        //NOTE: FOLLOW POM DESIGN PATTERN
        Driver.closeDriver();
    }


}
