package com.sda.mentoring.assignment.day04;

import com.sda.mentoring.assignment.day04.pagesd4.AddRecordDataProviderpage;
import com.sda.mentoring.utilities.ConfigReader;
import com.sda.mentoring.utilities.DriverSengel;
import org.testng.annotations.Test;

public class T01DynamicWebTableManagement {
    /*
 Go to https://claruswaysda.github.io/addRecordWebTable.html
 Add records to the table using DataProvider
 */




    @Test(dataProvider = "getRecord",dataProviderClass = com.sda.mentoring.utilities.DataProviderUtilities.class)
    public void DynamicWebTableManagement(String username ,String age , int indx)
    {
        DriverSengel.getDriver().get(ConfigReader.getProperty("ac_url"));
        AddRecordDataProviderpage providerpage =new AddRecordDataProviderpage();

        providerpage
                .enterName(username)
                .enterAge(age)
                .selectCountrByIndex(indx)
                .clickOnAddRecord();



        DriverSengel.closeDriver();
    }
}
