package com.techproed.soh.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductsPage {

    @FindBy(className = "product_label")
    public WebElement productsText;
    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
    public WebElement sauseLabOnesie;

    public SauceProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
}




