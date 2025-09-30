package com.sda.mentoring.assignment.day05.SmokeTest;

import com.sda.mentoring.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePage {







    @Test
    public void testlogin() {

        Driver.getDriver().get("https://automationexercise.com/");
        Driver.getDriver().findElement(By.xpath("//a[@href=\"#Women\"]")).click();
        Driver.getDriver().findElement(By.xpath("//a[@href=\"/category_products/1\"]")).click();
       WebElement titel = Driver.getDriver().findElement(By.xpath("//h2[@class=\"title text-center\"]"));

        Assert.assertTrue(titel.isDisplayed(),"It not contains inventory");

        Driver.closeDriver();
    }

    }