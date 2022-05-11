package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_cssSelector_getAttribute {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:
       WebElement userNameInput = driver.findElement(By.cssSelector("input[class='login-inp']"));
       userNameInput.sendKeys("Incorrect");

       //4- Click to `Reset password` button
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("Button[class='login-btn']"));
        resetPasswordButton.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
        WebElement errorLabel = driver.findElement(By.cssSelector("div[class='errortext']"));
        String actualerrorLabelText = errorLabel.getText();
        String expectederrorLabelText ="Login or E-mail not found";
        if(actualerrorLabelText.equals(expectederrorLabelText)){
            System.out.println("Error label test PASSED!");
        }else{
            System.out.println("Error label test FAİLED!!!");
        }




    }
}
