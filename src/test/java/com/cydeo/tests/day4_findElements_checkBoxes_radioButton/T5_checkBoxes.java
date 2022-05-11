package com.cydeo.tests.day4_findElements_checkBoxes_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_checkBoxes {
    public static void main(String[] args) {

        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        WebElement chechBox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        boolean control1 = chechBox1.isSelected();
        System.out.println("control1 = " + control1);

        //3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        boolean control2 = checkBox2.isSelected();
        System.out.println("control2 = " + control2);

        //4. Click checkbox #1 to select it.
        chechBox1.click();

        //5. Click checkbox #2 to deselect it.
       checkBox2.click();

       //6. Confirm checkbox #1 is SELECTED.
        System.out.println("chechBox1.isSelected() = " + chechBox1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

    }
}
