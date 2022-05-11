package com.cydeo.tests.day4_findElements_checkBoxes_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/abtest
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/abtest");

        //it is used for to stop the running until the page loads
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();

        //5- Verify it is displayed, again.

        //we are re-assigning the elements not to throw stale element exception!!!!!
        cydeoLink = driver.findElement(By.linkText("CYDEO"));
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


        //This is a simple StaleElementReferenceException to understand what is
        //this exception and how to handle it

    }
}
