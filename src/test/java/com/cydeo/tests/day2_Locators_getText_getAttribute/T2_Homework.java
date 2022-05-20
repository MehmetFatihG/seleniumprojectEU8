package com.cydeo.tests.day2_Locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class T2_Homework {
    public static void main(String[] args) {

        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        //Expected: “Log in to ZeroBank
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        String actualHeaderText = headerText.getText();
        String expectedHeaderText = "Log in to ZeroBank";
        Assert.assertEquals(actualHeaderText, expectedHeaderText);



    }
}
