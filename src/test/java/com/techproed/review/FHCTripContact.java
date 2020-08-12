package com.techproed.review;

import com.techproed.pages.MyCurrentProjectPage;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FHCTripContact extends TestBase {
    // 1_Go to http://www.fhctrip.com/contact
    // 2_Enter your name and surname in to name surname input box
    // 3_Enter your email address in to email address input box
    // 4_Enter your phone number in to phone number input box
    // 5_Enter the subject in to subject input box
    // 6_Enter your message in to message input box
    // 7_Click the send message box

    @Test
    public void contact() {

        MyCurrentProjectPage mycurProject = new MyCurrentProjectPage();
        Driver.getDriver().get("http://www.fhctrip.com/contact");

        mycurProject.name.sendKeys("John Cash");
        mycurProject.email.sendKeys("jhn@hotmail.com");
        mycurProject.phoneNumber.sendKeys("123456789");
        mycurProject.subject.sendKeys("room reservation");
        mycurProject.message.sendKeys("sea view");
        mycurProject.sendMessageButton.click();
        Assert.assertFalse(mycurProject.messageResult.isDisplayed());
    }
}







  /*  public void contactForm(){
        // Driver.getDriver().get("http://www.fhctrip.com/contact");
        driver.get("http://www.fhctrip.com/contact");
        // Thread.sleep(2000);
        WebElement name=driver.findElement(By.id("NameSurname"));
        name.sendKeys("John Cash");
        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("zchan@hotmail.com(opens in new tab)");
        WebElement phone=driver.findElement(By.id("PhoneNo"));
        phone.sendKeys("1124538900");
        WebElement subject=driver.findElement(By.id("Subject"));
        subject.sendKeys("room reservation");
        WebElement message=driver.findElement(By.id("Message"));
        message.sendKeys("The room should be sea view");
        WebElement sendMessage=driver.findElement(By.xpath("//input[@type='submit']"));
        sendMessage.click();
        */