package com.sda.mentoring.assignment.day03;

import com.sda.mentoring.utilities.DataProviderUtilities;
import com.sda.mentoring.utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.time.Duration;

public class T01NegativeTestingwithDataProvider  extends TestBase {
 /*
 Go to https://claruswaysda.github.io/signIn.html
 Do negative test with all scenarios
 */
    @Test(dataProvider = "negativloin",dataProviderClass =com.sda.mentoring.utilities.DataProviderUtilities.class)
    public void NegativewithDataProvider(@Optional("Tmara") String username,@Optional("678") String password) {

        driver.get("https://claruswaysda.github.io/signIn.html");
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;


        if (username.isEmpty() && password.isEmpty()) {
            // Handle both fields empty
            String validationMessage = (String) js.executeScript(
                    "return arguments[0].validationMessage;", usernameField);
            Assert.assertEquals(validationMessage, "Please fill out this field.");

        } else if (username.isEmpty()) {
            // Handle empty username field validation
            String validationMessage = (String) js.executeScript(
                    "return arguments[0].validationMessage;", usernameField);
            Assert.assertEquals(validationMessage, "Please fill out this field.");

        } else if (password.isEmpty()) {
            // Handle empty password field validation
            String validationMessage = (String) js.executeScript(
                    "return arguments[0].validationMessage;", passwordField);
            Assert.assertEquals(validationMessage, "Please fill out this field.");

        } else {

            // Handle incorrect credentials (both fields have values)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());
            Assert.assertEquals(driver.switchTo().alert().getText(), "Incorrect username or password");
        }

    }
}
