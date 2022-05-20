package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day5_Continue_T5_T6_T7_T8 {
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

    @Test
    public void dropdowns_task7(){
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Click to non-select dropdown
        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary" +
                " dropdown-toggle']"));
        nonSelectDropdown.click();

        //4. Select Facebook from dropdown
        WebElement facebookOption = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/']"));
        facebookOption.click();

        //5. Verify title is “Facebook - Log In or Sign Up
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Giriş Yap veya Kaydol";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void dropdowns_task8(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select all the options from multiple select dropdown.
        //4. Print out all selected values.
        Select options = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        List<WebElement> elements = options.getOptions();
        for (WebElement each : elements) {
            System.out.println(each.getText());
        }

        //5. Deselect all values.
    }

}
