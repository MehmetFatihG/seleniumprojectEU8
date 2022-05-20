package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownsPractices {
    @Test
    public void dropdown_task5(){
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //3. Select dropdown and Illinois
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        dropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        dropdown.selectByValue("VA");

        //5. Select California
        dropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String actualText = dropdown.getFirstSelectedOption().getText();
        String expectedText = "California";

        Assert.assertEquals(actualText,expectedText);

        //Use all Select options. (visible text, value, index
    }

    @Test
    public void dropdowns_task6(){
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select “December 1st, 1923” and verify it is selected.
        //Select year using : visible text
        Select year = new Select (driver.findElement(By.xpath("//select[@id='year']")));
        year.selectByVisibleText("1923");

        //Select month using : value attribute
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        month.selectByValue("11");

        //Select day using : index number
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        day.selectByIndex(0);

        String actualYear = year.getFirstSelectedOption().getText();
        String expectedYear = "1923";
        Assert.assertEquals(actualYear,expectedYear);

        String actualMonth = month.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth, expectedMonth);

        String actualDay = day.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay, expectedDay);








    }

}
