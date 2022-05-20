package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    //it logins to crm page with helpdesk1@cybertekschool.com username
    public static void login_crm(WebDriver driver){

        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInput.sendKeys("helpdesk1@cybertekschool.com");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys("UserUser");

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

    }

    //it logins to crm page with valid username and password
    public static void login_crm(WebDriver driver, String username, String password){

        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        usernameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

    }


}
