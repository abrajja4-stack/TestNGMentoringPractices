package com.sda.mentoring.tasks.day03;

import com.sda.mentoring.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T03nagitivsenario  extends TestBase {
    @Test(dataProvider = "negativloin2" ,dataProviderClass = com.sda.mentoring.utilities.DataProviderUtilities.class)
    public void test1( String firstname,String lastname, String email, String pasword) {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
        driver.findElement(By.id("firstName")).sendKeys(firstname);
        driver.findElement(By.id("lastName")).sendKeys(lastname);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(pasword);
        driver.findElement(By.id("submit")).click();
        WebElement txte =driver.findElement(By.id("error"));


    }
}
