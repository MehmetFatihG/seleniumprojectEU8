package com.cydeo.tests.day11_ActionsJSExecuterPractice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_ScrollJSExecuter {
    @Test
    public void scrollTest(){
        //TC #7: Scroll using JavascriptExecutor
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//div[text()='Powered by ']"));
        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[@class='nav-link']"));

        //3- Scroll down to “Cydeo” link
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink);

        BrowserUtils.sleep(3);

        //4- Scroll up to “Home” link
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);
        //5- Use below provided JS method only

        //JavaScript method to use : arguments[0].scrollIntoView(true)

        //Note: You need to locate the links as web elements and pass them as
        //arguments into executeScript() method
    }
}
