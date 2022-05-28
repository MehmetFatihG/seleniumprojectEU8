package com.cydeo.tests.day8_Properties_ConfigReader;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_ConfigurationPractice {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        assert driver != null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1- Open a chrome browser
        //2- Go to: https://google.com
        String env = ConfigurationReader.getProperty("env");
        driver.get(env);
    }

    @Test
    public void googleSearchTest(){
        //3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        String searchKeyword = ConfigurationReader.getProperty("searchKeyword");
        searchBox.sendKeys(searchKeyword + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search
        BrowserUtils.verifyExpectedTitle(driver,searchKeyword + " - Google'da Ara");

        //Use `configuration.properties` for the following:
        //1. The browser type
        //2. The URL
        //3. The search keyword
        //4. Make title verification dynamic. If search value changes, title assertion should not fail
    }
}
