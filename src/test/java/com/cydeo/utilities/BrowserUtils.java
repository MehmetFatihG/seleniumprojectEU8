package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    //it accepts integer seconds and execute Thread.sleep
    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //it switches between the open pages, gets the given Url and verifies the expected title
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> list = driver.getWindowHandles();
        for(String each : list ){
            driver.switchTo().window(each);
            if(driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    //it asserts if the expected title is true
    public static void verifyExpectedTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    //it waits explicitly for invisibility
    public static void waitForInvisibilityOf(WebElement element){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }



}
