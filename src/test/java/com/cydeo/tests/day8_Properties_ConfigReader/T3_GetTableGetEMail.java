package com.cydeo.tests.day8_Properties_ConfigReader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_GetTableGetEMail {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        assert driver != null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/tables");
    }

    @Test
    public void getEmailTest(){
        WebTableUtils.getTableGetEmail(driver,"1","John");
    }


}
/*
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/tables
3- Write custom method:
• Method name: getTableGetEmail()
• Return type: void
• Arg1: WebDriver driver
• Arg2: String tableNum
• Arg3: String firstName
 */