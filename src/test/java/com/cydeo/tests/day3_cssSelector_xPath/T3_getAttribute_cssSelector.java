package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {


        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In
        String actualLoginButton = driver.findElement(By.cssSelector("input[type='submit']"))
                .getAttribute("value");
        String expectedLoginButton = "Log In";
        if(actualLoginButton.equals(expectedLoginButton)){
            System.out.println("Login button test PASSED!");
        }else{
            System.out.println("Login button test FAİLED!!!");
        }


    }
}
