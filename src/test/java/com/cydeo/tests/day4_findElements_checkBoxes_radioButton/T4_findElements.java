package com.cydeo.tests.day4_findElements_checkBoxes_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T4_findElements {
    public static void main(String[] args) {


        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement> allElements = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("Number of the links = " + allElements.size());

        //5- Print out the texts of the links.
        for (WebElement each : allElements) {
            System.out.println(each.getText());
        }

        //6- Print out the HREF attribute values of the links
        for (WebElement each : allElements) {
            System.out.println(each.getAttribute("href"));
        }
    }
}
