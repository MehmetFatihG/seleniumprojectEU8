package com.cydeo.tests.day5_testNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_SimpleDropdowns {
    @Test
    public void simpleDropdownsTest(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String defaultSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(defaultSimpleDropdown,"Please select an option");

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        Select stateSelection = new Select(driver.findElement(By.id("state")));
        String actualDefault = stateSelection.getFirstSelectedOption().getText();
        String expected = "Select a State";
        Assert.assertEquals(actualDefault, expected);


    }
}
