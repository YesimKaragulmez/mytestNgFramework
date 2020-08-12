package com.techproed.soh.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceInventoryPage {


    @FindBy(id = "user-name")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(className = "btn_action")
    public WebElement loginButton;

    public SauceInventoryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
