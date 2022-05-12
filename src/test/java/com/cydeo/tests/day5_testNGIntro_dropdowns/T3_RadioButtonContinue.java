package com.cydeo.tests.day5_testNGIntro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.*;

import java.util.List;

public class T3_RadioButtonContinue {
    public static void main(String[] args) {

        //1. Open Chrome browser
        //2. Go to
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");

        //Locate name='sports' radio buttons and store them in a list of web element
        List<WebElement> sportsRadioButton = driver.findElements(By.name("sport"));


        //Loop through the list of WebElement  and select matching result "hockey"
        for (WebElement each : sportsRadioButton) {

            String eachId = each.getAttribute("id");

            if(eachId.equals("hockey")){
                each.click();
                System.out.println("each.isSelected() = " + each.isSelected());
                break;
            }
        }

        clickAndVerifyRadioButton(driver,"color", "yellow");

    }

    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idAttribute){

        List<WebElement> radioButton = driver.findElements(By.name(nameAttribute));

        for (WebElement each : radioButton) {
            if(each.getAttribute("id").equals(idAttribute)){
                each.click();
                System.out.println(each.getAttribute("id")+ " is selected: " + each.isSelected());
            }
        }

    }
    //Create a utility method to handle above logic.
    //Method name: clickAndVerifyRadioButton
    //Return type: void or boolean
    //Method args:
    //1. WebDriver
    //2. Name attribute as String (for providing which group of radio buttons)
    //3. Id attribute as String (for providing which radio button to be clicked)
    //Method should loop through the given group of radio buttons. When it finds the
    //matching option, it should click and verify option is Selected.
    //Print out verification: true





}
