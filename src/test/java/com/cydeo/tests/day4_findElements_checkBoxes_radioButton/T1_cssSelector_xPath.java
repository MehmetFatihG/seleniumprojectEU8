package com.cydeo.tests.day4_findElements_checkBoxes_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_cssSelector_xPath {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLinkButton = driver.findElement(By.cssSelector("a[class='nav-link']"));
        String actualHomeLinkButton = homeLinkButton.getText();
        String expectedHomeLinkButton = "Home";
        if(actualHomeLinkButton.equals(expectedHomeLinkButton)){
            System.out.println("Home link button test passed");
        }else{
            System.err.println("Home link button test FAİLED!!!");
        }
        //b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div[class='example']>h2"));

        //c. “E-mail” text
        WebElement emailLabel = driver.findElement(By.xpath("//label[text()='E-mail']"));

        //d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));

        //e. “Retrieve password” button
        WebElement retrievePassword = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredCydeoText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println(poweredCydeoText.getText());

        //4. Verify all web elements are displayed.

        System.out.println("poweredCydeoText.isDisplayed() = " + poweredCydeoText.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible





    }

}
