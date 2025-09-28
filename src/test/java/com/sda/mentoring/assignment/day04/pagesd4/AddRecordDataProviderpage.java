package com.sda.mentoring.assignment.day04.pagesd4;

import com.github.javafaker.Faker;
import com.sda.mentoring.tasks.day04.pages.AddRecordWebTablePage;
import com.sda.mentoring.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

public class AddRecordDataProviderpage {

    By nameBy = By.id("nameInput");
    By ageBy = By.id("ageInput");
    By selectBy = By.id("countrySelect");
    By addRecordButtonBy = By.xpath("//button[.='Add Record']");



    public AddRecordDataProviderpage enterName(String name){
        Driver.getDriver().findElement(nameBy).sendKeys(name);
        return this;
    }

    public AddRecordDataProviderpage enterAge(String age){
        Driver.getDriver().findElement(ageBy).sendKeys(age);
        return this;
    }


    public AddRecordDataProviderpage selectCountrByIndex(int idx){
        Select select = new Select(Driver.getDriver().findElement(selectBy));
        select.selectByIndex(idx);
        return this;
    }


    public AddRecordDataProviderpage clickOnAddRecord(){
        Driver.getDriver().findElement(addRecordButtonBy).click();
        return this;
    }





}
