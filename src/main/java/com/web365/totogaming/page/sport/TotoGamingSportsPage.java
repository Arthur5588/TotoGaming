package com.web365.totogaming.page.sport;

import com.web365.totogaming.page.home.TotoGamingHomePage;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.web365.totogaming.page.sport.TotoGamingSportsPageConstants.*;


public class TotoGamingSportsPage extends TotoGamingHomePage {
    public TotoGamingSportsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(xpath = UEFA_CHAMPIONS_LEAGUE_EVENT_XPATH)
    public WebElement uefaChampLeage;

    @FindBy(xpath = FRAME_XPATH)
    public WebElement frame;

    @FindBy(xpath = HOME_XPATH)
    public WebElement homeButton;

    @FindBy(xpath = LIVE_BETTING_TEXT_XPATH)
    public WebElement liveBeddingText;

    @FindBy(xpath = EVENT_LIST_BACKGROUND_IMAGE_XPATH)
    public WebElement backGroundImage;

    @FindBy(xpath = EVENT_LIST_XPATH)
    public WebElement evenListButton;

    @FindBy(xpath = LIVE_EVENT_LIST_XPATH)
    public WebElement liveEvenListButton;

    @FindBy(xpath = LIVE_LIST_HEADER_XPATH)
    public WebElement liveListHeader;

    @FindBy(xpath = CALENDAR_XPATH)
    public WebElement calendarButton;

    @FindBy(xpath = CALENDAR_ID_XPATH)
    public WebElement calendarID;

    @FindBy(xpath = RESULTS_XPATH)
    public WebElement resultsButton;

    @FindBy(xpath = RESULTS_SHOW_BUTTON_XPATH)
    public WebElement resultShowButton;

    @FindBy(xpath = SEARCH_FIELD_XPATH)
    public WebElement searchField;

    @FindBy(xpath = SEARCH_ICON_BUTTON_XPATH)
    public WebElement searchIconButton;

    @FindBy(xpath = SEARCH_RESULT_BY_FOOTBALL_TEAM_XPATH)
    public WebElement searchResultByFootballTeamName;

    @FindBy(xpath = TENNIS_PLAYER_XPATH)
    public WebElement tennisPlayerSearchResult;

    @FindBy(xpath = BASKETBALL_TEAM_RESULT_XPATH)
    public WebElement basketballSearchResult;

    @FindBy(xpath = COUNTRY_SEARCH_RESULT_LEAGUES_XPATH)
    public WebElement countryResultLeagues;
}
