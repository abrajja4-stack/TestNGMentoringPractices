package com.sda.mentoring.tasks.day04.pages;

import com.sda.mentoring.utilities.DriverSengel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ActionsFormPage {
    WebDriverWait wait = new WebDriverWait(DriverSengel.getDriver(), Duration.ofSeconds(10));

    By neme = By.id("name");
    By age = By.id("age");
    By selactdepartment =By.id("options");
    By chackboxByXpath = By.xpath("//input[@value=\"coding\"]");
    By rediobuttonByXpath = By.xpath("//input[@value=\"female\"]");
    By subimtByXpath = By.xpath("//button[@onclick=\"generatePasscode()\"]");
    By generatePasscode = By.xpath("//button[@type='button']");
    By submitButton = By.id("submitButton");

    public ActionsFormPage entername(String name){
        DriverSengel.getDriver().findElement(neme).sendKeys(name);
     return this;
    }

    public ActionsFormPage enterage(String age){
        DriverSengel.getDriver().findElement(this.age).sendKeys(age);
        return this;
    }


    public ActionsFormPage selactoption (String visibltext){
         Select select = new Select(DriverSengel.getDriver().findElement(selactdepartment));
         select.selectByVisibleText(visibltext);
        return this;
    }

    public ActionsFormPage  interests (){
      DriverSengel.getDriver().findElement(chackboxByXpath).click();

        return this;
    }

    public ActionsFormPage  gender (){
      DriverSengel.getDriver().findElement(rediobuttonByXpath).click();
        return this;
    }

    public ActionsFormPage  submint (){
        DriverSengel.getDriver().findElement(subimtByXpath).click();
        return this;
    }
    public ActionsFormPage formSubmit() {
        DriverSengel.getDriver().findElement(generatePasscode).click();
        return this;
    }
   /* public boolean isPasscodeSuccesfull() {
        String text= Driver.getDriver().switchTo().alert().getText();
        Driver.getDriver().switchTo().alert().accept();
        String passcode = text.replaceAll("[^0-9]","");
        System.out.println("passcode = " + passcode);
        Driver.getDriver().switchTo().alert().sendKeys(passcode);
        Driver.getDriver().switchTo().alert().accept();
        Driver.getDriver().switchTo().frame(0);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(submitButton)).isDisplayed();
    }*/

    public ActionsFormPage verifyPasscode() {
        Assert.assertTrue(DriverSengel.getDriver().switchTo().alert().getText().contains("Your passcode is:"));
        return this;
    }





}
