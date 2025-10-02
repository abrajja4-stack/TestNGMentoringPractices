package com.sda.mentoring.tasks.day04.pages;

import com.github.javafaker.Faker;
import com.sda.mentoring.utilities.DriverSengel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddRecordWebTablePage {
    By nameBy = By.id("nameInput");
    By ageBy = By.id("ageInput");
    By selectBy = By.id("countrySelect");
    By addRecordButtonBy = By.xpath("//button[.='Add Record']");
    By addedRecordsBy = By.xpath("//tbody/tr");


    public AddRecordWebTablePage enterName(String name){
        DriverSengel.getDriver().findElement(nameBy).sendKeys(name);
        return this;
    }

    public AddRecordWebTablePage enterAge(String age){
        DriverSengel.getDriver().findElement(ageBy).sendKeys(age);
        return this;
    }


    public AddRecordWebTablePage selectCountrByIndex(int idx){
        Select select = new Select(DriverSengel.getDriver().findElement(selectBy));
        select.selectByIndex(idx);
        return this;
    }
    public AddRecordWebTablePage clickOnAddRecord(){
        DriverSengel.getDriver().findElement(addRecordButtonBy).click();
        return this;
    }

    public AddRecordWebTablePage enterFakeRecord(int num){
        Faker faker = new Faker();
        for (int i = 0; i<num;i++){
            enterName(faker.name().username());
            enterAge(String.valueOf(faker.number().numberBetween(18,45)));
            selectCountrByIndex(faker.number().numberBetween(1,5));
            clickOnAddRecord();
        }
        return this;
    }
    public AddRecordWebTablePage deleteLastAddedRecord(){
        List<WebElement> recordsList = DriverSengel.getDriver().findElements(addedRecordsBy);
        recordsList.getLast().findElement(By.xpath(".//button[.='Delete']")).click();
        return this;
    }}


