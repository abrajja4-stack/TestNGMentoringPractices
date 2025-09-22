package com.sda.mentoring.assignment.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class T01HardAssertLoginTest {
    /*
     1. Navigate to
https://claruswaysda.github.io/signIn.html
 2. Enter username: "admin"
 3. Enter password: "123"
 4. Click Submit button
 5. Use hard assertions to verify:
 New page URL is "
 https://claruswaysda.github.io/signIn.html"
 Page contains text "Employee Table"
     */

    @Test
    public void testHardAssert() {
    //naviget and login successful
        driver.get("https://claruswaysda.github.io/signIn.html");
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        //assert the url
       // String actualurl ="https://claruswaysda.github.io/signIn.html";
        String expectedurl ="https://claruswaysda.github.io/signIn.html";
        Assert.assertEquals(driver.getCurrentUrl(),expectedurl,"Url not mach");

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
