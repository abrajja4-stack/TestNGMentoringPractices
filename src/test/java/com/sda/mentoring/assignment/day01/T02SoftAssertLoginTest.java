package com.sda.mentoring.assignment.day01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T02SoftAssertLoginTest {
    /*
     1. Navigate to
https://claruswaysda.github.io/signIn.html
 2. Enter username: "wronguser"
 3. Enter password: "wrongpass"
 4. Click Submit button
 5. Use soft assertions to verify:
 JavaScript alert is displayed
 Alert message text is "Incorrect username or password
     Create class
SoftAssertLoginTest
 Handle JavaScript alert using WebDriver's Alert interface
 Use SoftAssert object for assertions
 Include proper assertAll() call
 Add meaningful assertion messages
     */

    @Test
    public void testSoftAssertLogin() throws InterruptedException {
        //navgit and login Not successful
        driver.get("https://claruswaysda.github.io/signIn.html");
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("wronguser");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("wrongpass");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        //soft assertion obj
        SoftAssert softAssert = new SoftAssert();

        // small delay to allow alert to appear
        Thread.sleep(2000);

        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Soft assertion 1: Verify alert is displayed
        softAssert.assertNotNull(alert, "JavaScript alert should be displayed");

        // get alert text
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);

        // Soft assertion 2: Verify alert message text
        softAssert.assertEquals(alertText, "Incorrect username or password",
                "Alert message should be 'Incorrect username or password'");

        // Accept the alert to close it
        alert.accept();

        softAssert.assertAll();

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



















