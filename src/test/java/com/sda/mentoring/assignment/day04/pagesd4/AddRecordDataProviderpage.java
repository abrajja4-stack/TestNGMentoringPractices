package com.sda.mentoring.assignment.day04.pagesd4;

import com.sda.mentoring.utilities.DriverSengel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AddRecordDataProviderpage {

    By nameBy = By.id("nameInput");
    By ageBy = By.id("ageInput");
    By selectBy = By.id("countrySelect");
    By addRecordButtonBy = By.xpath("//button[.='Add Record']");



    public AddRecordDataProviderpage enterName(String name){
        DriverSengel.getDriver().findElement(nameBy).sendKeys(name);
        return this;
    }

    public AddRecordDataProviderpage enterAge(String age){
        DriverSengel.getDriver().findElement(ageBy).sendKeys(age);
        return this;
    }


    public AddRecordDataProviderpage selectCountrByIndex(int idx){
        Select select = new Select(DriverSengel.getDriver().findElement(selectBy));
        select.selectByIndex(idx);
        return this;
    }


    public AddRecordDataProviderpage clickOnAddRecord(){
        DriverSengel.getDriver().findElement(addRecordButtonBy).click();
        return this;
    }





}
