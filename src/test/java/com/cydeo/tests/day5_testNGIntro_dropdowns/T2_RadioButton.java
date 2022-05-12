package com.cydeo.tests.day5_testNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_RadioButton {
    public static void main(String[] args) {

        //1. Open Chrome browser
        //2. Go to
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());

        driver.close();

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS





    }
}
