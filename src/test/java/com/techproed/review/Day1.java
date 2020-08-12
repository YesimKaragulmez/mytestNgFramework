package com.techproed.review;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/* Test Case 1:
  Step1: Go to "https://www.airbnb.co.in/"
  Step2: get the title and print it
  Step3: get the current url of the page
  Step4: get the Page Source (the codes of the page)
  */
public class Day1 extends TestBase {
    @Test
    public void getTitleTest() {
        driver.get("https://www.airbnb.co.in/");
        String title = driver.getTitle();
        System.out.println("title = " + title);
        String current_url = driver.getCurrentUrl();
        System.out.println("current_url = " + current_url);
        String page_source = driver.getPageSource();
        System.out.println("page_source = " + page_source);
     /* Test Case 2:
       Step1: Go to "https://www.google.com"
       Step2: Navigate to "https://www.airbnb.co.in/"
       Step3: Navigate back to previous webpage
       Step4: Navigate forward to second webpage
       Step5: Refresh the page
       Step6: Close the webpage
       */
    }

    @Test
    public void NavigateTest() {
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.airbnb.co.in/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
        /*
        Test Case 3:
       Step1: Go to "http://ebay.com"
       Step2: Enter "selenium" in to Search input box
       Step3: Click on Search Button
       Step4: Check how many results for Selenium and print it
       Step5: Get current url
       Step6: Get page source
       Step7: Get the title
       Step8: Close the webpage
       */
    }

    @Test
    public void LocateTest1() throws InterruptedException {
        driver.get("http://ebay.com");
        WebElement searchbox = driver.findElement(By.id("gh-ac"));
        searchbox.sendKeys("selenium");
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();
        WebElement text = driver.findElement(By.className("srp-controls__count-heading"));
        String printText = text.getText();
        System.out.println(printText);
        String current_url = driver.getCurrentUrl();
        System.out.println("current_url = " + current_url);
        String page_source = driver.getPageSource();
        System.out.println("page_source = " + page_source);
        String title = driver.getTitle();
        System.out.println("title = " + title);
    }

    /*   Step1: Go to "https://twitter.com/login"
       Step2: Enter your name in to username input box
       Step3: Enter password in to password input box
       Step4: Close the webpage
   */
    @Test
    public void testTwitter() {
        driver.get("https://twitter.com/login");
        WebElement nameBox = driver.findElement(By.name("session[username_or_email]"));
        nameBox.sendKeys("Linda");
        WebElement passBox = driver.findElement(By.name("session[password]"));
        passBox.sendKeys("12345");
        driver.close();

    }
}














