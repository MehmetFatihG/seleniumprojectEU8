package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T2_GetText_getAttributes {
    public static void main(String[] args) {

        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String expected = "Remember me on this computer";
        String actual = driver.findElement(By.className("login-item-checkbox-label")).getText();
        if(actual.equals(expected)){
            System.out.println("Remember me test PASSED!");
        }else{
            System.out.println("Remember me test FAİLED!!!");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        actual = driver.findElement(By.linkText("FORGOT YOUR PASSWORD?")).getText();
        expected = "FORGOT YOUR PASSWORD?";
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        if(actual.equals(expected)){
            System.out.println("Forgot password test PASSED!");
        }else{
            System.out.println("Forgot password test FAİLED!!!");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        actual = driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");
        expected = "forgot_password=yes";
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        if(actual.contains(expected)){
            System.out.println("Attribute test PASSED!");
        }else{
            System.out.println("Attribute test FAİLED!!!");
        }
        //PS: Inspect and decide which locator you should be using to locate web
        //elements








    }
}
