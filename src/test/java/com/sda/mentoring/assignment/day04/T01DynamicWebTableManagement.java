package com.sda.mentoring.assignment.day04;

import com.github.javafaker.Faker;
import com.sda.mentoring.assignment.day04.pagesd4.AddRecordDataProviderpage;
import com.sda.mentoring.utilities.ConfigReader;
import com.sda.mentoring.utilities.DataProviderUtilities;
import com.sda.mentoring.utilities.Driver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class T01DynamicWebTableManagement {
    /*
 Go to https://claruswaysda.github.io/addRecordWebTable.html
 Add records to the table using DataProvider
 */

    @DataProvider
    public Object[][] getRecords() {
        return new Object[][]{
                {"johndoe","44",1},
                {"marystar","55",2},
                {"tomhawk","28",3},
                {"timlee","59",1},
                {"kenjoe","49",3}
        };
    }


    @Test(dataProvider = "getRecords")
    public void DynamicWebTableManagement(String username ,String age , int indx)
    {
        Driver.getDriver().get(ConfigReader.getProperty("ac_url"));
        AddRecordDataProviderpage providerpage =new AddRecordDataProviderpage();

        providerpage
                .enterName(username)
                .enterAge(age)
                .selectCountrByIndex(indx)
                .clickOnAddRecord();



        Driver.closeDriver();
    }
}
