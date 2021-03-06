package com.techproed.tests;

import com.techproed.pages.FhcLoginPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
    @Test(dataProvider = "log in data")
    public void LoginTest(String user, String pass) {
        Driver.getDriver().get(ConfigReader.getProperty("fhc_login_url"));
        FhcLoginPage fhcLoginPage = new FhcLoginPage(Driver.getDriver());
        fhcLoginPage.username.sendKeys("user1");
        fhcLoginPage.password.sendKeys("pass1");
        fhcLoginPage.login.click();
        Assert.assertFalse(fhcLoginPage.error_message.getText().contains(ConfigReader.getProperty("login_error_message")));
    }

    @DataProvider(name = "log in data")
    public Object[][] getData() {
        //{{user1,pass1},
        // {user2,pass2},
        // {user3,pass3}}
        Object[][] data = new Object[3][2];
        //1st row of data
        data[0][0] = "user1";
        data[0][1] = "pass1";
        //2nd row of data
        data[1][0] = "user2";
        data[1][1] = "pass2";
        //3rd data
        data[2][0] = "user3";
        data[2][1] = "pass3";
        return data;
    }
}


