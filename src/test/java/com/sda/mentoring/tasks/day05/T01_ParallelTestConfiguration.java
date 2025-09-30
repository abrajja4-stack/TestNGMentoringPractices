package com.sda.mentoring.tasks.day05;

import com.sda.mentoring.tasks.day04.pages.CLContactListPage;
import com.sda.mentoring.tasks.day04.pages.CLHomePage;
import com.sda.mentoring.utilities.ConfigReader;
import com.sda.mentoring.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class T01_ParallelTestConfiguration {


/*
 Create a TestNG XML file with parallel execution at the method level
 Set thread count to 3
 Include at least 2 test methood: PositiveLoginTest and NegativeLoginTest
 Configure timeout for each test method to 30 seconds
 */

    @Test
    void positiveLoginTest() {

        CLHomePage homePage = new CLHomePage();
        CLContactListPage contactListPage = new CLContactListPage();
        Driver.getDriver().get(ConfigReader.getProperty("cl_url"));
        homePage.email.sendKeys(ConfigReader.getProperty("cl_email"));
        homePage.password.sendKeys(ConfigReader.getProperty("cl_password"));
        homePage.submit.click();
        assert contactListPage.logout.isDisplayed();
        Driver.closeDriver();

    }

    @Test
    void negativLoginTest() {
        CLHomePage homePage = new CLHomePage();
        Driver.getDriver().get(ConfigReader.getProperty("cl_url"));
        homePage.password.sendKeys(ConfigReader.getProperty("cl_password"));
        homePage.submit.click();
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(homePage.error));
        assert homePage.error.isDisplayed();
        Driver.closeDriver();
    }
}



