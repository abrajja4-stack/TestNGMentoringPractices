package com.sda.mentoring.utilities;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;

public class DataProviderUtilities {


    @DataProvider
    public Object[][] getRecords() {
        return new Object[][]{
                {"johndoe", "123", "Comments from John", "Drop Down Item 3"},
                {"marystar", "767", "Comments from Mary", "Drop Down Item 2"},
                {"tomhawk", "889", "Comments from Tom", "Drop Down Item 1"},
                {"timlee", "098", "Comments from Tim", "Drop Down Item 5"},
                {"kenjoe", "567", "Comments from Ken", "Drop Down Item 4"},
        };
    }


    @DataProvider(name = "faker")
    public Object[][] getFakerRecords() {
        Faker faker = new Faker();

        return new Object[][]{
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(2), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(2), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(2), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(2), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(2), "Drop Down Item " + faker.number().numberBetween(1, 7)},
                {faker.name().username(), faker.internet().password(), faker.lorem().paragraph(2), "Drop Down Item " + faker.number().numberBetween(1, 7)}
        };
    }


    @DataProvider(name = "excelDP")
    public Object[][] getUserDataFromExcel() {
        ExcelUtilities eu = new ExcelUtilities("Users.xlsx", "UserData");
        return eu.getExcelDataAsArray();


    }

    @DataProvider
    public Object[][] getEmployeeDataFromExcel() {
        ExcelUtilities eu = new ExcelUtilities("Users.xlsx", "Employees");
        return eu.getExcelDataAsArray();


    }

    @DataProvider
    public Object[][] negativloin() {
        return new Object[][]{
                {"tala", "555"},//both not corect
                {"admin", "099"},//username corect password not corect
                {"sara", "123"},//username  not corect password corect
                {"", "123"},//username empty  password corect
                {" admin", ""},//username corect  password empty
                {"", ""},//username and password empty

        };
    }

    @DataProvider
    public Object[][] negativloin2() {
        return new Object[][]{
                {"TOM", "Star","adimin@domain.com","123456"},//pasword short
                {"TOM", "Star","test@domain.com","1234567"},//email used befor


        };
    }

    @DataProvider
    public Object[][] getRecord() {
        return new Object[][]{
                {"johndoe","44",1},
                {"marystar","55",2},
                {"tomhawk","28",3},
                {"timlee","59",1},
                {"kenjoe","49",3}
        };
    }
}
