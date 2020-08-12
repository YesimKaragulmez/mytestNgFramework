package com.techproed.pageobjecttests;

import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

public class HotelroomCreationTest extends TestBase {

    @Test
    public void positiveTest() throws InterruptedException {
        driver.get("http://www.fhctrip.com/admin/HotelRoomAdmin");

  /*      FHCReservationPage hotelRoomPage = new FHCReservationPage(driver);
        hotelRoomPage.username.sendKeys("manager2");
        hotelRoomPage.password.sendKeys("Man1ager2!");
        hotelRoomPage.login.click();
        hotelRoomPage.addHotelRoom.click();
        hotelRoomPage.verfyCreateHotelRoomText.isDisplayed();
        hotelRoomPage.idHotel.isSelected();
        hotelRoomPage.code.sendKeys("Royal");
        hotelRoomPage.name.sendKeys("456");
        hotelRoomPage.textbox.sendKeys("This room is donated by foundation");

        WebElement source = driver.findElement(By.xpath("//li[@data-id='700']"));
        WebElement target=driver.findElement(By.name("Price"));
        actions.dragAndDrop(source,target).perform();
        //room type
        WebElement roomType=driver.findElement(By.id("IDGroupRoomType"));
        Select options=new Select(roomType);
        options.selectByIndex(6);
        //max adult count
        hotelRoomPage.adultCount.sendKeys("2");
       // driver.findElement(By.id("MaxAdultCount")).sendKeys("2");
        //max children count
        hotelRoomPage.childCount.sendKeys("3");
      //  driver.findElement(By.id("MaxChildCount")).sendKeys("3");
        //click on save button
        hotelRoomPage.saveclick.click();
       // driver.findElement(By.id("btnSubmit")).click();
      //  boolean isTrue=driver.findElement(By.xpath("//div[@class='bootbox-body']"),"HotelRoom was inserted successfully"));
      //  Assert.assertTrue(isTrue);
        WebElement popUpMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bootbox-body']")));
        String actualTextMessage=popUpMessage.getText();
        String expectedTestMessage="HotelRoom was inserted successfully";
        Assert.assertEquals(actualTextMessage,expectedTestMessage);

        hotelRoomPage.okButton.click();

       /// WebElement okButton=driver.findElement(By.xpath("(//button[@type='button'])[6]"));
       // okButton.click();
        Thread.sleep(5000);                              //a[@href='/admin/HotelRoomAdmin']
        WebElement hotelRooms=wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Hotel Rooms")));
        actions.doubleClick(hotelRooms).perform();

        WebElement listText=driver.findElement(By.xpath("//span[text()='List Of Hotelrooms']"));
        Assert.assertTrue(listText.isDisplayed());

//        Then verify you hotel is being created(You can use id, code, or name to verify)
        String myHotelName=driver.findElement(By.xpath("//tr[10]//td[2]")).getText();
        Assert.assertTrue(myHotelName.equals("Hilton Hotel-1"));

*/

    }
}




