package com.techproed.soh.tests;

import com.techproed.soh.pages.SauceLoginPage;
import com.techproed.soh.pages.SauceProductsPage;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Soh_Day_4 {

    SauceLoginPage sauceLoginPage = new SauceLoginPage();
    SauceProductsPage sauceProductsPage = new SauceProductsPage();

    // go to "https://www.saucedemo.com/"
    // login with username "standard_user" and password "secret_sauce"
    // verify that the Products text exists
    @Test
    public void loginTest() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        sauceLoginPage.username.sendKeys("standard_user");
        sauceLoginPage.password.sendKeys("secret_sauce");
        sauceLoginPage.loginButton.click();
        Assert.assertEquals(sauceProductsPage.productsText.getText(), "Products");
    }

    // go to "https://www.saucedemo.com/"
    // login with username "locked_out_user" and password "secret_sauce"
    // verify that the error message contains "Sorry, this user has been locked out."
    @Test
    public void lockoutTest() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        sauceLoginPage.username.sendKeys("locked_out_user");
        sauceLoginPage.password.sendKeys("secret_sauce");
        sauceLoginPage.loginButton.click();
        Assert.assertTrue(sauceLoginPage.error_message.getText().contains("Sorry, this user has been locked out."));
    }
    // go to "https://www.saucedemo.com/inventory.html"
// sort products by "Price (low to high)"
// verify that the first item is "Sauce Labs Onesie"


    @Test
    public void firstProduct() {
        Driver.getDriver().get("https://www.saucedemo.com/");
        sauceLoginPage.username.sendKeys("standard_user");
        sauceLoginPage.password.sendKeys("secret_sauce");
        sauceLoginPage.loginButton.click();


        Select select = new Select(sauceProductsPage.productsText);
        String firstOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(firstOption, "Sauce Labs Backpack");
        //select 4th option by index
        select.selectByIndex(2);
        String forthOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(forthOption, "Sauce Labs Fleece Jacket");
        //printing all options
        List<WebElement> allOptions = select.getOptions();
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }
    }
}



