package com.sda.mentoring.tasks.day01;

import org.testng.annotations.Test;

public class T02AttributePracticeTest {
    /*
    1. Create a class called
AttributePracticeTest
 2. Create 5 test methods with different priorities (1, 3, 2, 5, 4)
 3. Create one test method with
enabled = false
 4. Create a test method with timeout of 3 seconds that includes
Thread.sleep(2000)
 5. Create a test method with timeout of 1 second that includes
Thread.sleep(2000) (should fail)
 6. Add meaningful descriptions to all test methods
 7. Create test methods with groups: "smoke", "regression", "api"
     */

    @Test(priority = 1,description = " test with priotity1",groups = "smoke")
    public void test1() {
        System.out.println("test1");
    }

    @Test(priority = 3,description = " test with priotity2",groups ="regression" )
    public void test2() {
        System.out.println("test2");
    }

    @Test(priority = 2,description = " test with priotity2",groups = {"smoke", "regression"})
    public void test3() {
        System.out.println("test3");
    }

    @Test(priority = 5,description = " test with priotity5",groups = "api")
    public void test4() {
        System.out.println("test4");
    }

    @Test(priority = 4,description = " test with priotity4",groups = "api")
    public void test5() {
        System.out.println("test5");
    }

    @Test(enabled = false,description = "test with enabled")
    public void test6() {
        System.out.println("test6");
    }

    @Test(timeOut = 3000,description = "test with timeout1")
    public void test7() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Test 7");
    }

    @Test(timeOut = 100,description = "test with timeout2")
    public void test8() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Test 8");
    }


}
