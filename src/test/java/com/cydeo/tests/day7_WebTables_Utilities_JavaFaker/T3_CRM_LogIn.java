package com.cydeo.tests.day7_WebTables_Utilities_JavaFaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LogIn {

    @Test
    public void crmLoginTest() {
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInput.sendKeys("helpdesk1@cybertekschool.com");

        //4. Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyExpectedTitle(driver, "Portal");

        //USERNAME PASSWORD
        //helpdesk1@cybertekschool.com UserUser
        //Helpdesk2@cybertekschool.com UserUser
    }

    @Test
    public void crmLoginTest2() {
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.login_crm(driver);

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyExpectedTitle(driver, "Portal");

    }

    @Test
    public void crmLoginTest3() {
        //1. Create new test and make set ups
        //2. Go to : http://login1.nextbasecrm.com/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login1.nextbasecrm.com/");

        CRM_Utilities.login_crm(driver, "helpdesk2@cybertekschool.com", "UserUser");

        //6. Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyExpectedTitle(driver, "Portal");


    }


}