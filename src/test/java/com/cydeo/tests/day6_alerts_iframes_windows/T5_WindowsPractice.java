package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //1. Create a new class called: T5_WindowsPractice
        //2. Create new test and make set ups
        //3. Go to : https://practice.cydeo.com/windows
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void windowsTest(){

        //4. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);

        //5. Click to: “Click Here” link
        WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();

        //6. Switch to new Window.
        Set<String> allElements = (driver.getWindowHandles());
        for(String each : allElements){
           driver.switchTo().window(each);
        }

        //7. Assert: Title is “New Window
        actualTitle = driver.getTitle();
        expectedTitle = "New Window";
        Assert.assertEquals(actualTitle, expectedTitle);

    }


}
