package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FhcLoginPage {
    @FindBy(id = "UserName")
    public WebElement username;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "btnSubmit")
    public WebElement login;
    @FindBy(xpath = "//div[@id='divMessageResult']")
    public WebElement error_message;
    WebDriver driver;

    public FhcLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String un, String pw) {
        username.sendKeys(un);
        password.sendKeys(pw);
        login.click();
    }


}
