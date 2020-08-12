package com.techproed.soh.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Soh_Day_2 extends TestBase {

    // go to fhctrip.com and verify the "FHCTRIP" text on the top-left corner
    // go to fhctrip.com and verify the "Welcome To Our Hotel" text
    // go to fhctrip.com and verify the number of staff is "1,000"

    @Test
    public void fhctripTextTest() {
        driver.get("http://www.fhctrip.com/");
        WebElement fhcTripLink = driver.findElement(By.className("navbar-brand"));
        System.out.println(fhcTripLink.getText());
        Assert.assertEquals(fhcTripLink.getText(), "FHCTRIP");
    }

    @Test
    public void welcomeTest() throws InterruptedException {
        driver.get("http://www.fhctrip.com/");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(500);
        WebElement welcomeText = driver.findElement(By.xpath("(//h2[@class='mb-4'])[1]"));
        Assert.assertEquals(welcomeText.getText(), "Welcome To Our Hotel");
    }

    @Test
    public void staffNumberTest() throws InterruptedException {
        driver.get("http://www.fhctrip.com/");
        for (int i = 0; i < 6; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            Thread.sleep(500);
        }
        Thread.sleep(7000);
        WebElement staffVerify = driver.findElement(By.xpath("//strong[@data-number='1000']"));
        System.out.println(" Actual Number is : " + staffVerify.getText());
        Assert.assertEquals(staffVerify.getText(), "1,000");
    }
}




