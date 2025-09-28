package com.sda.mentoring.tasks.day04.pages;


import com.sda.mentoring.utilities.Driver;
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

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    public FillFormPage fillName(String name) {
        Driver.getDriver().findElement(nameField).sendKeys(name);
        return this;
    }

    public FillFormPage fillAge(String age) {
        Driver.getDriver().findElement(ageField).sendKeys(age);
        return this;
    }

    public FillFormPage fillOptions(String optionsValue) {
        Select depOpt = new Select(Driver.getDriver().findElement(departmentSelect));
        depOpt.selectByValue(optionsValue);
        return this;
    }

    public FillFormPage fillInterest(String interest) {
        Driver.getDriver().findElement(By.xpath(String.format(codingInterest,interest))).click();
        return this;
    }

    public FillFormPage fillGender() {
        Driver.getDriver().findElement(gender).click();
        return this;
    }

    public FillFormPage formSubmit() {
        Driver.getDriver().findElement(generatePasscode).click();
        return this;
    }

    public boolean isPasscodeSuccesfull() {
       String text= Driver.getDriver().switchTo().alert().getText();
        Driver.getDriver().switchTo().alert().accept();
        String passcode = text.replaceAll("[^0-9]","");
        System.out.println("passcode = " + passcode);
        Driver.getDriver().switchTo().alert().sendKeys(passcode);
        Driver.getDriver().switchTo().alert().accept();
        Driver.getDriver().switchTo().frame(0);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton)).isDisplayed();
    }

    public FillFormPage verifyPasscode() {
        Assert.assertTrue(Driver.getDriver().switchTo().alert().getText().contains("Your passcode is:"));
        return this;
    }
}