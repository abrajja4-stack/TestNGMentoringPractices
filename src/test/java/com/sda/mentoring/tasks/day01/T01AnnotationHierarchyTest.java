package com.sda.mentoring.tasks.day01;

import org.testng.annotations.*;

public class T01AnnotationHierarchyTest {
    /*
 1. Create a TestNG class called
AnnotationHierarchyTest
 2. Implement all TestNG annotations (@BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod,
 @Test, @AfterMethod, @AfterClass, @AfterTest, @AfterSuite)
 3. Add print statements in each method to observe execution order
 4. Create 2 test methods
 5. Run the test and analyze console outpu

     */

    @BeforeSuite
    void beforSuite(){
        System.out.println("@BeforeSuite");
    }

    @BeforeTest
    void befortest(){
        System.out.println("@BeforeTest");
    }

    @BeforeClass
    void beforclass(){
        System.out.println("beforclass");
    }

    @BeforeMethod
    void beformethd(){
        System.out.println(" @BeforeMethod");

    }
    @Test
    void test1(){
        System.out.println("test1");
    }

    @Test
    void test2(){
        System.out.println("test2");
    }

    @AfterMethod
    void aftermethod(){
        System.out.println(" @BeforeMethod");
    }
    @AfterClass
    void afterclass(){
        System.out.println("@AfterClass");
    }
    @AfterTest
    void aftertest(){
        System.out.println(" @AfterClass");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("@AfterSuite");

    }

}