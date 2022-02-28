package com.web365.sport;

import com.web365.base.TotoGamingBaseTest;
import com.web365.totogaming.page.sport.TotoGamingSportsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TotoGamingSportsPageSearchTest extends TotoGamingBaseTest {

    @Test
    public void verifySearchWorksByFootballTeamName() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        //driver.switchTo().frame(sportsPage.frame);
        //sportsPage = sportsPage.goSportsPage();
        sportsPage.searchField.click();
        sportsPage.searchField.sendKeys("Real Madrid");
        sportsPage.searchIconButton.click();
        Thread.sleep(3000);
        sportsPage.searchField.clear();
        Assert.assertTrue(sportsPage.searchResultByFootballTeamName.isDisplayed());
    }

    @Test
    public void verifySearchWorksTennisPlayerName() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        //driver.switchTo().frame(sportsPage.frame);
        //sportsPage = sportsPage.goSportsPage();
        sportsPage.searchField.click();
        sportsPage.searchField.sendKeys("Karen Khachanov");
        sportsPage.searchIconButton.click();
        Thread.sleep(1500);
        sportsPage.searchField.clear();
        Assert.assertTrue(sportsPage.tennisPlayerSearchResult.isDisplayed());
    }

    @Test
    public void verifySearchWorksBasketballTeamName() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        driver.switchTo().frame(sportsPage.frame);
        //sportsPage = sportsPage.goSportsPage();
        sportsPage.searchField.click();
        sportsPage.searchField.sendKeys("Brooklyn Nets");
        sportsPage.searchIconButton.click();
        Thread.sleep(1500);
        sportsPage.searchField.clear();
        Assert.assertTrue(sportsPage.basketballSearchResult.isDisplayed());
    }

    @Test
    public void verifySearchWorksByCountryName() throws InterruptedException {
        TotoGamingSportsPage sportsPage = new TotoGamingSportsPage(this.driver);
        //driver.switchTo().frame(sportsPage.frame);
        //sportsPage = sportsPage.goSportsPage();
        sportsPage.searchField.click();
        sportsPage.searchField.sendKeys("Spain");
        sportsPage.searchIconButton.click();
        Thread.sleep(1500);
        sportsPage.searchField.clear();
        Assert.assertTrue(sportsPage.countryResultLeagues.isDisplayed());
    }
}
