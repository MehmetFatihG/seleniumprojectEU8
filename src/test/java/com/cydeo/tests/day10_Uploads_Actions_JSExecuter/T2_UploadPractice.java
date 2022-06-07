package com.cydeo.tests.day10_Uploads_Actions_JSExecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadPractice {

    @Test
    public void uploadPracticeTest(){
        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload ");

        //2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\Lenovo\\Desktop\\HTML class\\OlafVlog\\dog.jpg";

        //3. Upload the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        fileUpload.sendKeys(path);

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        String actualText = Driver.getDriver().findElement(By.xpath("//h3")).getText();
        String expectedText = "File Uploaded!";
        Assert.assertEquals(actualText,expectedText);


    }
}
