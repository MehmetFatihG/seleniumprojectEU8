package com.cydeo.tests.day1_SeleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        // this opens an empty driver
        WebDriver driver = new ChromeDriver();

        //this maximizes the browser windows
        driver.manage().window().maximize();

        //get method is used to open
        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //navigate back is used for selenium to navigate back
        driver.navigate().back();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //navigate forward
        driver.navigate().forward();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // navigate refresh
        driver.navigate().refresh();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //to navigate to
        driver.navigate().to("https://www.google.com");
        currentTitle = driver.getTitle();

        //getTitle method gets the title and returns a strings
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println(currentTitle);

        //get the current url by using the selenium,it is returns string
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //this closes the current opened window
        driver.close();

        //this closes all of the opened windows
        driver.quit();









    }
}
