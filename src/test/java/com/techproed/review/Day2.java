package com.techproed.review;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Day2 extends TestBase {
    /*Step1: Go to "https://www.airbnb.co.in/"
      Step2: Click Signup Button
      Step3: Close the webpage
           */
    @Test
    public void locateTest3() {
        driver.get("https://www.airbnb.co.in/");
        driver.findElement(By.linkText("Sign up")).click();
        // driver.findElement(By.partialLinkText("Sign"));
        driver.close();
    }

    /*Step1: Go to "https://www.airbnb.co.in/"
      Step2: Find out how many WebElements there are with tagName "div"
      Step3: Close the webpage
      */
    @Test
    public void webpage() {
        driver.get("https://www.airbnb.co.in/");
        List<WebElement> div = driver.findElements(By.tagName("div"));
        System.out.println(div.size());
        driver.close();
    }

    /*    Step1: Go to "https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html"
          Step2: Enter April 29 as a start date in to select  start date input box
          Step3: Enter May 2 as an end date in to select  end date input box
          Step4: Close the page
         */
    @Test
    public void selectDateTest2() {
        driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
        WebElement start_date = driver.findElement(By.xpath("//input[@placeholder='Start date']"));
        start_date.click();
        WebElement start = driver.findElement(By.xpath("(//td[text()='29'])[2]"));
        actions.moveToElement(start).click().perform();
        WebElement end_date = driver.findElement(By.xpath("//input[@placeholder='End date']"));
        end_date.click();
        WebElement end = driver.findElement(By.xpath("//td[@class='new day' and text()='2']"));
        actions.moveToElement(end).click().perform();

    }

    /*Step1: Go to "https://demos.telerik.com/kendo-ui/dragdrop/index"
       Step2: Drag the small circle
       Step3: Drop to bigger circle
       Step4: Close the webpage
           */
    @Test
    public void dragAndDropTest() {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        driver.findElement(By.xpath("//button[@title='Accept Cookies']")).click();
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
    }

    /*Step1: Go to "https://the-internet.herokuapp.com/hovers"
    Step2: Hover your mouse on all pictures
    Step3: Close the webpage
       */
    @Test
    public void hoverOver() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement pictures1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        actions.moveToElement(pictures1).build().perform();

        WebElement pictures2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        actions.moveToElement(pictures2).build().perform();

        WebElement pictures3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
        actions.moveToElement(pictures3).build().perform();

    }

    /*Step1: Go to "https://the-internet.herokuapp.com/infinite_scroll"
      Step2: Scroll Down and Scroll Up
      Step3: Close the webpage
           */
    @Test
    public void scrollDownandUpTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            jse.executeScript("window.scrollBy(0,250)");
        }
        for (int i = 0; i < 10; i++) {
            Thread.sleep(500);
            jse.executeScript("window.scrollBy(0,-250)");
        }
    }
}
















