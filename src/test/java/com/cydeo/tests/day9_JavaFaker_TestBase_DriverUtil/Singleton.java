package com.cydeo.tests.day9_JavaFaker_TestBase_DriverUtil;

public class Singleton {

    private static String word;

    private Singleton(){};

    public static String getWord(){
        if(word ==null){
            System.out.println("First time call. Word object is null. Assigning value it now");
            word = "something";
        }else{
            System.out.println("Word has already vaule");
        }
        return word;
    }

}
