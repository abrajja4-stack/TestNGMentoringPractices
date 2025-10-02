package com.sda.mentoring.tasks.day04.pages;

import com.sda.mentoring.utilities.DriverSengel;
import org.openqa.selenium.By;

    public class ClaruswaySdaPage {
        By addRecordWebTableBy = By.xpath("//a[.='Add Record Web Table']");

        public AddRecordWebTablePage clickWebTable(){
            DriverSengel.getDriver().findElement(addRecordWebTableBy).click();
            return new AddRecordWebTablePage();
        }
    }

