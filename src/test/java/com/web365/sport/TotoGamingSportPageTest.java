package com.web365.sport;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.web365.base.TotoGamingBaseTest;
import com.web365.totogaming.page.home.TotoGamingHomePage;
import com.web365.totogaming.page.sport.TotoGamingSportsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class TotoGamingSportPageTest extends TotoGamingBaseTest {


    @Test
    public void verifyHomeButtonWorks() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        sportsPage.homeButton.click();
        Thread.sleep(1000);
        Assert.assertTrue(sportsPage.liveBeddingText.isDisplayed());
    }

    @Test
    public void verifyEventListWorks() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        //driver.switchTo().frame(sportsPage.frame);
        sportsPage.evenListButton.click();
        Thread.sleep(2000);
        Assert.assertTrue(sportsPage.backGroundImage.isDisplayed());
    }

    @Test
    public void verifyLiveEventListWorks() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        sportsPage.liveEvenListButton.click();
        Thread.sleep(1000);
        Assert.assertTrue(sportsPage.liveListHeader.isDisplayed());
    }

    @Test
    public void verifyCalendarWorks() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        driver.switchTo().frame(sportsPage.frame);
        sportsPage.calendarButton.click();
        Thread.sleep(1000);
        Assert.assertTrue(sportsPage.calendarID.isDisplayed());
    }

    @Test
    public void verifyResultsWorks() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        sportsPage.resultsButton.click();
        Thread.sleep(1000);
        Assert.assertTrue(sportsPage.resultShowButton.isDisplayed());
    }










//    @Test
//    public void verifySportsPageDisplayed() throws InterruptedException {
//
//
//        //driver.findElement(By.xpath("//div[@class='cookies-close']")).click();
//        Thread.sleep(1000);
////        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
////        driver.switchTo().window(tabs.get(0));
//         TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
//
//        driver.switchTo().frame(sportsPage.frame);
//        driver.findElement(By.xpath("//span[contains(text(),'England. EFL Cup')]")).click();
//        Thread.sleep(1500);
//
//
////        Actions actions = new Actions(driver);
////        actions.moveToElement(sportsPage.uefaChampLeage).click();
//
//        //System.out.println(driver.findElement(By.xpath("//li[@title='Home']")).isDisplayed());
//
//        //div[@class='cookies-close']
//        //a[@data-href='/en/Login/Login']
//        //li[@title='Home']
//    }
}
