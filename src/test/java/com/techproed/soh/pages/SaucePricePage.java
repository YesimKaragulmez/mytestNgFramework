package com.techproed.soh.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucePricePage {

    @FindBy(className = "inventory_item_name")
    public WebElement dropdown;

    public SaucePricePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
