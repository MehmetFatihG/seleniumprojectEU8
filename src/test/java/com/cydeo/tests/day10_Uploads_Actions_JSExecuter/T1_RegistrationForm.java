package com.cydeo.tests.day10_Uploads_Actions_JSExecuter;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_RegistrationForm {

    @Test
    public void registrationFormTest1(){
        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

        Faker faker = new Faker();
        //3. Enter first name
        WebElement firstNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement lastNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastNameInput.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement usernameInput = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        usernameInput.sendKeys(faker.bothify("####??????"));

        //6. Enter email address
        WebElement emailInput = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys(faker.bothify("???###@gmail.com"));

        //7. Enter password
        WebElement passwordInput = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys(faker.numerify("########"));

        //8. Enter phone number
        WebElement phoneInput = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneInput.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement maleButton = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        maleButton.click();

        //10. Enter date of birth
        WebElement birthInput = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthInput.sendKeys(faker.numerify("12/08/1980"));

        //11. Select Department/Office
        Select department = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByValue("MCTC");

        //12. Select Job Title
        Select jobtitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobtitle.selectByVisibleText("SDET");

        //13. Select programming language from checkboxes
        WebElement progLanguage  = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        progLanguage.click();

        //14. Click to sign up button
        WebElement signupButton = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signupButton.click();

        //15. Verify success message “You’ve successfully completed registration.” is displayed.
        String actual = Driver.getDriver().findElement(By.xpath("//p")).getText();
        String expected = "You've successfully completed registration!";
        Assert.assertEquals(actual, expected);

        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense
    }
}
