package com.Linkedin;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public WebDriver driver;
    protected HomePage homePage;
    protected WebDriverWait wait;


    @Before
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/didi1/Downloads/chromedriver_win32/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/");
        //  String titleExpected = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        //String title = driver.getTitle();

        //Assert.assertEquals(titleExpected, title);
    }
}