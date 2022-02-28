package com.web365.totogaming.page.home;

import com.web365.totogaming.page.base.TotoGamingBasePage;
import com.web365.totogaming.page.sport.TotoGamingSportsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.web365.totogaming.page.home.TotoGamingHomePageConstants.*;

public class TotoGamingHomePage extends TotoGamingBasePage {

    public TotoGamingHomePage(WebDriver driver) {
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

    @FindBy(xpath = SPORTS_BUTTON_XPATH)
    public WebElement sportsButton;

    public TotoGamingSportsPage goSportsPage(){
        sportsButton.click();
        return new TotoGamingSportsPage(this.driver);
    }

    public TotoGamingHomePage loginIconClick() {
        login.click();
        return new TotoGamingHomePage(this.driver);
    }

    public TotoGamingHomePage registerClick() {
        register.click();
        return new TotoGamingHomePage(this.driver);
    }

    public void emailFill(String email){
        emailField.sendKeys(email);
    }
    public void passwordFill(String pass){
        passwordField.sendKeys(pass);
    }

    public TotoGamingHomePage loginButtonClick(){
        loginButton.click();
        return new TotoGamingHomePage(this.driver);
    }

    public void addClick(){
        addIcon.click();
    }

    public boolean isLogOutdisplayed(){
        return logout.isDisplayed();
    }

}
