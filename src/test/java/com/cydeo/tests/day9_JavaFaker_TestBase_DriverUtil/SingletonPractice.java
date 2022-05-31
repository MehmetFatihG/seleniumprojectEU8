package com.cydeo.tests.day9_JavaFaker_TestBase_DriverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test
    public void singletonPracticeTest(){

        String str = Singleton.getWord();
        System.out.println("str = " + str);

        str= Singleton.getWord();
        System.out.println("str = " + str);


    }

    @Test
    public void singletonPracticeTest2(){
        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);
    }


}
