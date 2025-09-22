package com.sda.mentoring.tasks.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class T03DependencyTest {
    /*
     1. Create a class called
DependencyTest
 2. Create a
@BeforeClass method to set up WebDriver
 3. Create the following dependent test chain:
 openYahoo() - Navigate to Yahoo
 openBing() - Navigate to Bing (depends on Yahoo test)
 openDuckDuckGo() - Navigate to DuckDuckGo (depends on Bing test)
 4. Add intentional failure in Yahoo test and observe behavior
 5. Create
@AfterClass method to close driver
     */

    @Test
    public void openYahoo() {
        driver.get("https://login.yahoo.com");
        Assert.fail();
    }

    @Test(dependsOnMethods ="openYahoo" )
    public void openBing() {
        driver.get("https://www.bing.com");
    }

    @Test(dependsOnMethods ="openBing")
    public void openDuckDuckGo() {
        driver.get("https://duckduckgo.com");
    }

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }










}
