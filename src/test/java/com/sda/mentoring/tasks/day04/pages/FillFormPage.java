package com.sda.mentoring.tasks.day04.pages;


import com.sda.mentoring.utilities.DriverSengel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FillFormPage {

    By nameField = By.id("name");
    By ageField = By.id("age");
    By departmentSelect = By.id("options");
    By submitButton = By.id("submitButton");
    String codingInterest = "//input[@value='%s']";
    By gender = By.xpath("//input[@value='male']");
    By generatePasscode = By.xpath("//button[@type='button']");

    WebDriverWait wait = new WebDriverWait(DriverSengel.getDriver(), Duration.ofSeconds(10));
    public FillFormPage fillName(String name) {
        DriverSengel.getDriver().findElement(nameField).sendKeys(name);
        return this;
    }

    public FillFormPage fillAge(String age) {
        DriverSengel.getDriver().findElement(ageField).sendKeys(age);
        return this;
    }

    public FillFormPage fillOptions(String optionsValue) {
        Select depOpt = new Select(DriverSengel.getDriver().findElement(departmentSelect));
        depOpt.selectByValue(optionsValue);
        return this;
    }

    public FillFormPage fillInterest(String interest) {
        DriverSengel.getDriver().findElement(By.xpath(String.format(codingInterest,interest))).click();
        return this;
    }

    public FillFormPage fillGender() {
        DriverSengel.getDriver().findElement(gender).click();
        return this;
    }

    public FillFormPage formSubmit() {
        DriverSengel.getDriver().findElement(generatePasscode).click();
        return this;
    }

    public boolean isPasscodeSuccesfull() {
       String text= DriverSengel.getDriver().switchTo().alert().getText();
        DriverSengel.getDriver().switchTo().alert().accept();
        String passcode = text.replaceAll("[^0-9]","");
        System.out.println("passcode = " + passcode);
        DriverSengel.getDriver().switchTo().alert().sendKeys(passcode);
        DriverSengel.getDriver().switchTo().alert().accept();
        DriverSengel.getDriver().switchTo().frame(0);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton)).isDisplayed();
    }

    public FillFormPage verifyPasscode() {
        Assert.assertTrue(DriverSengel.getDriver().switchTo().alert().getText().contains("Your passcode is:"));
        return this;
    }
}