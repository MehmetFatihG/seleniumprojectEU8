package com.cydeo.tests.day3_CssSelector_Xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T4_CssSelector_GetText {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password

        String actualResetButtonText = driver.findElement(By.cssSelector("Button[class='login-btn']")).getText();
        String expectedResetButtonText = "Reset password";
        if(actualResetButtonText.equals(expectedResetButtonText)){
            System.out.println("Reset button test PASSED!");
        }else{
            System.err.println("Reset button test FAİLED!!!");
        }







    }
}
