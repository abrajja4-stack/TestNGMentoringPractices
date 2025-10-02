package com.sda.mentoring.tasks.day04;

import com.sda.mentoring.tasks.day04.pages.ActionsFormPage;
import com.sda.mentoring.utilities.ConfigReader;
import com.sda.mentoring.utilities.DriverSengel;
import org.testng.annotations.Test;

public class Task2ActionsFormAutomation {
 /*
 Go to https://claruswaysda.github.io/ActionsForm.html
 Fill form and submit
 Do all actions and assert
 */

    @Test
    public void testActionsFormAutomation() {
        DriverSengel.getDriver().get(ConfigReader.getProperty("ac_url"));

        ActionsFormPage formPage =new ActionsFormPage();
        formPage
                .entername("Sara")
                .enterage("22")
                .selactoption("IT Department")
                .interests()
                .gender()
                .submint()
                .formSubmit()
                .verifyPasscode();



        DriverSengel.closeDriver();
    }
}
