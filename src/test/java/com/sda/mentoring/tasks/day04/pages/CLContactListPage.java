package com.sda.mentoring.tasks.day04.pages;

import com.sda.mentoring.utilities.Driver;
import com.sda.mentoring.utilities.DriverSengel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CLContactListPage {

    public CLContactListPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "logout")
    public WebElement logout;

}