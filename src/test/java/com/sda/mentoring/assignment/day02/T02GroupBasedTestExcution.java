package com.sda.mentoring.assignment.day02;

import org.testng.annotations.Test;

public class T02GroupBasedTestExcution {


    @Test(groups = "smoke", description = " test group smoke")
    void testSmoke1(){
        System.out.println(" smoke test 1");
    }

    @Test (groups = "smoke", description = " test group smoke")
    void testSmoke2(){
        System.out.println(" smoke test 2");
    }

    @Test (groups = "regression", description = " test  group regression")
    void testRegression01(){
        System.out.println(" regression test 1");}

    @Test (groups = "regression", description = " test group regression")
    void testRegression02(){
        System.out.println(" regression test2");
    }

    @Test (groups = "api", description = "test  group api")
    void testApi01(){
        System.out.println(" api test1");
    }

    @Test (groups = "api", description = "test group api")
    void testApi02(){
        System.out.println(" api test 2");
    }
}
