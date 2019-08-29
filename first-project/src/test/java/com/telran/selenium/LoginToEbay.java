package com.telran.selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase {
    @Test
    public void logInTest(){
        openSite("https://ebay.com");
        initLogin();
        fillLoginForm("asdfg@fghj.com", "123456789");
        clickLoginButton();

    }

}
