package com.sda.mentoring.assignment.day05;

import com.sda.mentoring.utilities.ConfigReader;
import com.sda.mentoring.utilities.Driver;
import org.testng.annotations.Test;

public class T01SmokeTestSuiteImplementation {

    /*
     Task 3: Smoke Test Suite Implementation
 Objective: Design and implement a comprehensive smoke test suite for an e-commerce application.
 Requirements:
 Create at least 3 smoke test classes: HomePageDone, ProductPage, and CheckoutPage
 Each class should contain one critical path test
 Organize tests in a "smokeTest" package
 Create XML configuration with verbose level 5
All tests should complete within 2 minutes total
 Expected Output: A reliable smoke test suite that validates core application functionality
     */


    @Test
    public void SmokeTest() {

        Driver.getDriver().get(ConfigReader.getProperty("sl"));


    }
}
