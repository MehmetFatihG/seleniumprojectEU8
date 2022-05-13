package com.cydeo.tests.day5_testNGIntro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupMethod(){
        System.out.println("Before class is running");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
    }
    @AfterMethod
    public void teardown(){
        System.out.println("After method is running");
    }




    @Test
    public void test1(){

        System.out.println("Test 1 is running");

        //Assert Equals: Compare of the 2 same things
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void test2(){

        System.out.println("Test 2 is running");

        String actual = "apple";
        String expected = "apple";

        //assertTrue
        Assert.assertTrue(actual.equals(expected));
    }





}
