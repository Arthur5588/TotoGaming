package com.web365.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TotoGamingBaseTest {


    public static final String URL = "https://www.totogaming.am/en/";

    protected WebDriver driver;

    @BeforeClass
    public void openTotoGaming() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @AfterMethod
    public void reloadTotoGaming(){
        driver.get(URL);
    }


    @AfterClass
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }
}
