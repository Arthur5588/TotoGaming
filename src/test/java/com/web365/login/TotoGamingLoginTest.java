package com.web365.login;

import com.web365.base.TotoGamingBaseTest;
import com.web365.totogaming.page.home.TotoGamingHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TotoGamingLoginTest  extends TotoGamingBaseTest {

    public static final String ACCOUNT_USERNAME = "******";
    public static final String ACCOUNT_PASSWORD = "******";


    @Test
    public void LoginWithCorrectCre() throws InterruptedException {
        TotoGamingHomePage homePage = new TotoGamingHomePage(this.driver);
        homePage.loginIconClick();
        Thread.sleep(2000);
        homePage.emailFill(ACCOUNT_USERNAME);
        homePage.passwordFill(ACCOUNT_PASSWORD);
        homePage.loginButtonClick();
        Thread.sleep(2000);
        homePage.addClick();
        Thread.sleep(1000);
        homePage.userAccount.click();

        Assert.assertTrue(homePage.isLogOutdisplayed());
    }

    @Test
    public void LoginOnlyWithEmail() throws InterruptedException {
        TotoGamingHomePage homePage = new TotoGamingHomePage(this.driver);
        homePage.loginIconClick();
        Thread.sleep(2000);
        homePage.emailFill(ACCOUNT_USERNAME);
        homePage.loginButtonClick();
        Assert.assertTrue(homePage.redLineLogin.isDisplayed());

    }

}
