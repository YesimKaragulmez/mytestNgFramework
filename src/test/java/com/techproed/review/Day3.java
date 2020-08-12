package com.techproed.review;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3 extends TestBase {
    /*    Step1: Go to "https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html"
            Step2: Click on Download
            Step3: wait until 100½ download
            Step5: verify that download process is 100%
            Step6: get a print out of 100% at the end
            Step7: Close the webpage
         */
    @Test
    public void percentageTest() {
        driver.get("https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
        driver.findElement(By.id("cricle-btn")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement percentage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='percenttext' and text()='100%']")));
        String expectedMessage = "100%";
        String actualMessage = driver.findElement(By.className("percenttext")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        System.out.println(actualMessage);
    }

    /*Step1: Go to "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html"
      Step2: Click first "Click me!" button and press OK
      Step3: Click second "Click me!" button and press OK
      Step4: Click second "Click for Prompt Box" button and enter your name press OK
      Step5: Print the Alert Message "You have entered 'Harun' !"
      Step6: Close the webpage
       */
    @Test
    public void alertTest() throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
        alert.dismiss();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
        alert.sendKeys("Yesim");
        alert.accept();
        Thread.sleep(2000);
        String alertMessage = driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText();
        System.out.println("alertMessage = " + alertMessage);
    }
}




