package com.sda.mentoring.tasks.day04;

import com.sda.mentoring.tasks.day04.pages.FillFormPage;

import com.sda.mentoring.utilities.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class T0FillForm {

    /*
    Go to https://claruswaysda.github.io/ActionsForm.html
    Fill form and submit
    Do all actions and assert
    */

    @Test
    public void testAddRecord() {


       Driver.getDriver().get("https://claruswaysda.github.io/ActionsForm.html");
        FillFormPage fillFormPage = new FillFormPage();

        boolean isSubmitButtonVisible =
                fillFormPage
                .fillName("Test")
                .fillAge("25")
                .fillOptions("it")
                .fillInterest("design")
                .fillGender()
                .formSubmit()
                .isPasscodeSuccesfull();

        Assert.assertTrue(isSubmitButtonVisible);




      //  Driver.closeDriver();
    }
    @Test
    public void testAddRecord02() {


        Driver.getDriver().get("https://claruswaysda.github.io/ActionsForm.html");
        FillFormPage fillFormPage = new FillFormPage();

                fillFormPage
                        .fillName("Test")
                        .fillAge("25")
                        .fillOptions("it")
                        .fillInterest("design")
                        .fillGender()
                        .formSubmit()
                        .verifyPasscode();

        Driver.closeDriver();
    }}

