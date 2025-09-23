package com.sda.mentoring.assignment.day02;

import com.sda.mentoring.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T02AmazonSearchTestwithParameters extends TestBase {

    /*
 1. Navigate to: https://www.amazon.com
 2. Search for different keywords: Java, Selenium
 3. Assert that result text contains the searched word
 4. Run tests from XML file using parameters
     */

    @Test
    @Parameters("KeyWord")
    public void testParsmeters(@Optional("C++") String keyWord) throws InterruptedException {
        // 1. Navigate to: https://www.amazon.com
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    //2. Search for different keywords: Java
        driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(keyWord);
        driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
        // 3. Assert that result text contains the searched word
        Thread.sleep(2000);
        String pageSource =driver.getPageSource();
        Assert.assertTrue(pageSource.contains(keyWord),"Search result should contain java");

    }
}
