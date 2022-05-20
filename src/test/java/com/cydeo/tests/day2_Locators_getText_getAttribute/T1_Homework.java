package com.cydeo.tests.day2_Locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class T1_Homework {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”
        WebElement searchBar = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchBar.sendKeys("wooden spoon");
        WebElement seachClick = driver.findElement(By.xpath("//button[contains(@class,'search-input-btn-group__btn')]"));
        seachClick.click();


        //4. Verify title:
        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon | Etsy";
        Assert.assertEquals(actualTitle, expectedTitle);

        //Expected: “Wooden spoon | Etsy






    }
}
