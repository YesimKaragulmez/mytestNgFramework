package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlbHomePage {

    @FindBy(linkText = "Join Now")
    public WebElement joinNowButton;
    @FindBy(id = "header_search_category")
    public WebElement allCategories;

    public GlbHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}






