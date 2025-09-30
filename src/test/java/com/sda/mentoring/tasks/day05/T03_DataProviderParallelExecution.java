package com.sda.mentoring.tasks.day05;

import com.sda.mentoring.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class T03_DataProviderParallelExecution {




   @Test(dataProvider = "dataprovider1")
   void testDataProvider(String searchTerm) throws InterruptedException {

       Driver.getDriver().get("https://duckduckgo.com/");
       Driver.getDriver().findElement(By.xpath("//input[@id='searchbox_input']")).sendKeys(searchTerm, Keys.ENTER);

       //assert result
       Thread.sleep(2000);
       Assert.assertTrue(Driver.getDriver().getTitle().contains(searchTerm));
       Driver.closeDriver();
   }



    @DataProvider( parallel = true)
    public Object[][] dataprovider1() {
        return new Object[][]{
                {"Java"}, {"C++"}, {"JavaScript"}, {"HTML"}, {"Python"}

        };
    }
}