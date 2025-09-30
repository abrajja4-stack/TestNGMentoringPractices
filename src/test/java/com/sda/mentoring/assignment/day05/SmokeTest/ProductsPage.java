package com.sda.mentoring.assignment.day05.SmokeTest;

import com.sda.mentoring.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ProductsPage {



    @Test
    public void testproudctsPage() {

        Driver.getDriver().get("https://automationexercise.com/");
        Driver.getDriver().findElement(By.xpath("//a[@href=\"/products\"]")).click();
        Driver.getDriver().findElement(By.xpath("//input[@id=\"search_product\"]")).sendKeys("Blue Top");
        Driver.getDriver().findElement(By.xpath("//button[@id=\"submit_search\"]")).click();
        WebElement bluetob = Driver.getDriver().findElement(By.xpath("//div[@class=\"productinfo text-center\"]"));
        Assert.assertTrue(bluetob.isDisplayed(),"It not contains inventory");

        Driver.closeDriver();

    }



}