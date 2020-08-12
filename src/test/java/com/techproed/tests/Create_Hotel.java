package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Create_Hotel extends TestBase {
    /*   Go to http://www.fhctrip.com/admin/HotelAdmin
       Create a hotel if the is not any
       And Click on Details on one of the hotel
       And verifies the “Edit Hotel” text that opened on the window

     */
    @Test
    public void hotel() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.get("http://www.fhctrip.com/admin/HotelAdmin");
        WebElement userName = driver.findElement(By.id("UserName"));
        userName.sendKeys("manager2");
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Man1ager2!");
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        driver.findElement(By.xpath("//span[@class='hidden-480']")).click();

        WebElement code = driver.findElement(By.id("Code"));
        code.sendKeys("12345");
        WebElement name = driver.findElement(By.id("Name"));
        name.sendKeys("Hilton");
        WebElement address = driver.findElement(By.id("Address"));
        address.sendKeys("Athens");
        WebElement phone = driver.findElement(By.id("Phone"));
        phone.sendKeys("69800000");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("akara@gmail.com");
        WebElement group = driver.findElement(By.id("IDGroup"));

        Select option = new Select(group);
        option.selectByIndex(2);
        Thread.sleep(5000);
        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSubmit")));
        actions.doubleClick(saveButton).perform();

        WebElement ok = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        ok.click();
        Thread.sleep(5000);
        actions.sendKeys(Keys.PAGE_UP);
        WebElement hotelList = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Hotel List")));
        actions.doubleClick(hotelList).build().perform();
        Thread.sleep(5000);
        WebElement details = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Details")));
        details.click();





  /* WebElement detail=driver.findElement(By.xpath("//a[@target='_blank'][7]"));
   detail.click();

    WebElement hotelText= driver.findElement(By.className("caption"));
    System.out.println(hotelText.getText());
    Assert.assertEquals(hotelText.getText(),"Edit Hotel");

*/


    }


}
