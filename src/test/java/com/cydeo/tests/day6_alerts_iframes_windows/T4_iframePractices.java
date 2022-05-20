package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iframePractices {
    @Test
    public void iframeTest(){

        //3. Go to: https://practice.cydeo.com/iframe
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/iframe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4. Assert: “Your content goes here.” Text is displayed.
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframe);
        WebElement text = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        String actualText = text.getText();
        String expectedText = "Your content goes here.";
        Assert.assertEquals(actualText, expectedText);
        driver.switchTo().parentFrame();

        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
        WebElement text2 = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(text2.isDisplayed());




    }
}
