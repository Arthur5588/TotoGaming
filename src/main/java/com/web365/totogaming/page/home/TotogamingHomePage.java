package com.web365.totogaming.page.home;

import com.web365.totogaming.page.base.TotoGamingBasePage;
import org.asynchttpclient.netty.EagerResponseBodyPart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.web365.totogaming.page.home.TotoGamingHomePageConstants.*;

public class TotogamingHomePage extends TotoGamingBasePage {

    public TotogamingHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = LOGO_XPATH)
    public WebElement logo;

    @FindBy(xpath = LOGIN_XPATH)
    protected WebElement login;

    @FindBy(xpath = REGISTER_XPATH)
    public WebElement register;

    @FindBy(xpath = LOGOUT_XPATH)
    public WebElement logout;

    @FindBy(xpath = LANGUAGE_ICON_XPATH)
    public WebElement languageDropMenu;

    @FindBy(xpath = ARMENIAN_LANGUAGE_XPATH)
    public WebElement ArmenianLang;

    @FindBy(xpath = ENGLISH_LANGUAGE_XPATH)
    public WebElement EnglishLang;

    @FindBy(xpath = RUSSIAN_LANGUAGE_XPATH)
    public WebElement RussianLang;

    @FindBy(xpath = PERSIAN_LANGUAGE_XPATH)
    public WebElement PersianLang;

    @FindBy(xpath = EMAIL_FIELD_XPATH)
    public WebElement emailField;

    @FindBy(xpath = PASSWORD_FIELD_XPATH)
    public WebElement passwordField;

    @FindBy(xpath = LOGIN_BUTTON_XPATH)
    public WebElement loginButton;

    @FindBy(xpath = ADD_XPATH)
    public WebElement addIcon;

    @FindBy(xpath = USER_XPATH)
    public WebElement userAccount;

    @FindBy(xpath = RED_LINE_SIGNIN_XPATH)
    public WebElement redLineLogin;

    public TotogamingHomePage loginIconClick() {
        login.click();
        return new TotogamingHomePage(this.driver);
    }

    public TotogamingHomePage registerClick() {
        register.click();
        return new TotogamingHomePage(this.driver);
    }

    public void emailFill(String email){
        emailField.sendKeys(email);
    }
    public void passwordFill(String pass){
        passwordField.sendKeys(pass);
    }

    public TotogamingHomePage loginButtonClick(){
        loginButton.click();
        return new TotogamingHomePage(this.driver);
    }

    public void addClick(){
        addIcon.click();
    }

    public boolean isLogOutdisplayed(){
        return logout.isDisplayed();
    }

}
