package com.cydeo.tests.day8_Properties_ConfigReader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTableOrderVerification {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        assert driver != null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void OrderNameVerifyTest() {
        //1. Go to: https://practice.cydeo.com/web-tables
        // 2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        WebElement name = driver.findElement(By.xpath("(//td[.='Bob Martin'])[1]"));
        String actualName = name.getText();
        String expectedName = "Bob Martin";
        Assert.assertEquals(actualName, expectedName);

        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
       /* WebElement date = driver.findElement(By.xpath("//td[.='Bob Martin']/following-sibling::td[3]"));
        String actualDate = date.getText();
        String expectedDate = "12/31/2021";
        Assert.assertEquals(actualDate, expectedDate);*/
        WebTableUtils.orderVerify(driver,"Bob Martin","12/31/2021");

        String result = WebTableUtils.returnOrderDate(driver,"Bob Martin");
        System.out.println(result);
    }


}
