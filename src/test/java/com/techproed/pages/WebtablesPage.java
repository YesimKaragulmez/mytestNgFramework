package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebtablesPage {

    @FindBy(id = "UserName")
    public WebElement username;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "btnSubmit")
    public WebElement login;
    @FindBy(xpath = "//span[text()='Try again please']")

    public WebElement verifyText;
    WebDriver driver;

    public WebtablesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


}


