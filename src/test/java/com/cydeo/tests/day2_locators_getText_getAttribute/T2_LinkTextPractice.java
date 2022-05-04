package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //it is used for storing the data -> WebElement
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        String expected = "No A/B Test";
        String actualTitle = driver.getTitle();
        if(expected.equals(actualTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        driver.navigate().back();

        String expected2 = "Practice";
        actualTitle= driver.getTitle();
        if(expected2.equals(actualTitle)){
            System.out.println("passed2");
        }else{
            System.out.println("failed2");
        }













    }



}
