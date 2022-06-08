package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //1-Initialize the driver instance and object of the class
    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //2-Use FindBy annotation to locate web elements
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailorPasswordErrorMessage;

}
