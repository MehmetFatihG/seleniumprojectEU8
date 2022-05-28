package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    //2. Create two methods to verify order
//Method #1 info:
//• Name: returnOrderDate ()
//• Return type: String
//• Arg1: WebDriver driver
//• Arg2: String costumerName
//This method should accept a costumerName and return the costumer order date
//as a String
    public static String returnOrderDate(WebDriver driver, String customerName){
        WebElement date = driver.findElement(By.xpath("//td[.='"+ customerName +"']/following-sibling::td[3]"));
        return date.getText();
    }
    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //• Arg3: String expectedOrderDate
    //This method should accept above mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate
    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){
        WebElement date = driver.findElement(By.xpath("//td[.='"+customerName+"']/following-sibling::td[3]"));
        String actualDate = date.getText();
        Assert.assertEquals(actualDate, expectedOrderDate);
    }

}
