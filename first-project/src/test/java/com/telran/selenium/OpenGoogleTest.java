package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenGoogleTest extends TestBase {

    @Test
        public void searchJavaTest() throws InterruptedException {
        openSite("https://www.google.com/");
        type(By.name("q"),"java"+Keys.ENTER);

            Thread.sleep(7000);
        }
}

