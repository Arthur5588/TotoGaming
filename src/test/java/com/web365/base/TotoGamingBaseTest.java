package com.web365.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TotoGamingBaseTest {


    public static final String URL = "https://totogaming.com/Sport";

    protected WebDriver driver;

    @BeforeClass
    public void openTotoGaming() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        driver.get(URL);
        Thread.sleep(2000);
    }



    @AfterClass
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
