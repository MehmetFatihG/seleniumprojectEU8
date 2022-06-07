package com.cydeo.tests.day10_Uploads_Actions_JSExecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_ActionsHover {

    @Test
    public void hoverTest(){
        //TC #3: Hover Test
        //1. Go to https://practice.cydeo.com/hovers
        Driver.getDriver().get("https://practice.cydeo.com/hovers ");

        //Locate all of the images in the page
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 =Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 =Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locate all users texts under here
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        //2. Hover over to first image
        //3. Assert:
        //a. “name: user1” is displayed
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed());
        //b. “view profile” is displayed
        WebElement profile = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[1]"));
        Assert.assertTrue(profile.isDisplayed());

        //4. Hover over to second image
        //5. Assert:
        //a. “name: user2” is displayed
        actions.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());
        //b. “view profile” is displayed
        WebElement profile2 = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[2]"));
        Assert.assertTrue(profile2.isDisplayed());

        //6. Hover over to third image
        //7. Confirm:
        //a. “name: user3” is displayed
        actions.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());
        //b. “view profile” is displayed
        WebElement profile3 = Driver.getDriver().findElement(By.xpath("(//a[.='View profile'])[3]"));
        Assert.assertTrue(profile3.isDisplayed());

    }
}
