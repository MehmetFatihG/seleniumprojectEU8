package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

    public  DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//div[.='Loading... ']")
    public WebElement loading;

    @FindBy(xpath = "//input[@type='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@id='flash']")
    public WebElement invalidPasswordErrorMessage;

}
