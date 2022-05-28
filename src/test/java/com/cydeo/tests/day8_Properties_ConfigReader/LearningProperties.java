package com.cydeo.tests.day8_Properties_ConfigReader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void javaPropertiesReadingTest(){

        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }
}
