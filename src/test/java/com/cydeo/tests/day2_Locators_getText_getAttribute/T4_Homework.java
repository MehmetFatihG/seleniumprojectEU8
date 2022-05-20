package com.cydeo.tests.day2_Locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T4_Homework {
    public static void main(String[] args) {

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/inputs
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();
        //4- Verify title is as expected:
        //Expected: Practice
        String actualText = driver.getTitle();
        String expectedText = "Practice";
        System.out.println(actualText.equals(expectedText));

        //PS: Locate “Home” link using “className” locator




    }
}
