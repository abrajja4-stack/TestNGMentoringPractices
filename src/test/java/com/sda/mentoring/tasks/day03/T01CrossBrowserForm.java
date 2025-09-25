package com.sda.mentoring.tasks.day03;

import com.sda.mentoring.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T01CrossBrowserForm  extends TestBase {
    /*
 Go to https://claruswaysda.github.io/ActionsForm.html
 Fill form and submit
 Do all actions and assert
 Do this test with Chrome, Edge and Firefox
 */


    @Test
    @Parameters({"browser", "name" , "age", "departement"})
    public void CrossBrowserForm(@Optional("chrome") String browser, @Optional("John") String name , @Optional("23") String age ,@Optional("IT Department") String Department) {
        driver.get("https://claruswaysda.github.io/ActionsForm.html");
        driver.findElement(By.id("name")).sendKeys( name );
        driver.findElement(By.id("age")).sendKeys( age );
        WebElement dd = driver.findElement(By.id("options"));
        new Select(dd).selectByVisibleText(Department);
        driver.findElement(By.xpath("//BUTTON[@type=\"button\"]")).click();

    }
}
