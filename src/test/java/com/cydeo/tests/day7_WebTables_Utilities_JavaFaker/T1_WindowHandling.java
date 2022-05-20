package com.cydeo.tests.day7_WebTables_Utilities_JavaFaker;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void windowHandlingTest(){

        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");

        //3. Copy paste the lines from below into your class
        //Lines to be pasted:
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> list = driver.getWindowHandles();
        for(String each : list ){
            driver.switchTo().window(each);
            System.out.println(driver.getCurrentUrl());
            if(driver.getCurrentUrl().contains("etsy.com")){
                break;
            }
        }

        //5. Assert: Title contains “Etsy”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Etsy";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}
