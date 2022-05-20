package com.cydeo.tests.day2_Locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_Homework {
    public static void main(String[] args) {

        //1- Open a chrome browser
        //2- Go to: https://google.com
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"));
        gmail.click();

        //4- Verify title contains:
        //Expected: Gmail
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.contains("Gmail"));

        //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google
        actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        System.out.println(actualTitle.equals(expectedTitle));






    }

}
