package com.sda.mentoring.assignment.day05.SmokeTest;

import com.sda.mentoring.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class ChakoutPage {

    @Test
    public void testcheckout() throws InterruptedException {

        Driver.getDriver().get("https://automationexercise.com/");
        Driver.getDriver().findElement(By.xpath("//a[@href=\"/login\"]")).click();
        Driver.getDriver().findElement(By.xpath("//input[@data-qa=\"login-email\"]")).sendKeys("ssara@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@data-qa=\"login-password\"]")).sendKeys("1234567");
        Driver.getDriver().findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
        Thread.sleep(2000);
        WebElement logologout = Driver.getDriver().findElement(By.xpath("//a[@href=\"/logout\"]"));
        Assert.assertTrue(logologout.isDisplayed(),"It not display");
        logologout.click();
        Driver.closeDriver();
    }
}