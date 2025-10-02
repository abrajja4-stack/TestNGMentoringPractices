package com.sda.mentoring.tasks.day04;


import com.sda.mentoring.tasks.day04.pages.ClaruswaySdaPage;
import com.sda.mentoring.utilities.DriverSengel;
import org.testng.annotations.Test;

public class T01WebTAbleRecordManagementFluentPage {
/*
Go to https://claruswaysda.github.io/addRecordWebTable.html
Add 5 records
Delete first record you created.
(Use Fluent POM and don't use any index in locators)
*/

    @Test
    public void test01() {
        DriverSengel.getDriver().get("https://claruswaysda.github.io");
        ClaruswaySdaPage sdaPage = new ClaruswaySdaPage();
        sdaPage
                .clickWebTable()
                .enterFakeRecord(5)
                .deleteLastAddedRecord();
    }
}



