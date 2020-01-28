package org.abryg.webpages;

import org.abryg.webwidgets.GoogleSearchFooterWidget;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchMainWebPage extends AbstractGoogleWebPageWithSearch {

    private By googleLogoSelector = By.id("hplogo");
    private By googleButtonPanelSelector = By.cssSelector("div.FPdoLc");
    private WebElement googleButtonPanel;
    private By googlePopUpButtonPanelSelector = By.cssSelector("div.tfB0Bf");
    private By googleSearchButtonSelector = By.cssSelector("input.gNO89b");
    private By googleIAmFeelingLuckyButtonSelector = By.cssSelector("input.RNmpXc");
    private GoogleSearchFooterWidget googleSearchFooterWidget;


    public GoogleSearchMainWebPage() {
        super("Google", "");
        googleSearchFooterWidget = new GoogleSearchFooterWidget();
    }

    @Override
    public GoogleSearchMainWebPage initializePage() {
        super.initializePage();
        locateElement(googleLogoSelector);
        this.googleButtonPanel = locateElement(googleButtonPanelSelector);
        locateElement(googleButtonPanel, googleSearchButtonSelector);
        locateElement(googleButtonPanel, googleIAmFeelingLuckyButtonSelector);
        googleSearchFooterWidget.initializeWidget();
        return this;
    }

    public GoogleSearchResultsWebPage searchUsingGoogleSearchButton(String textToSearch) {
        enterValue(searchInputFieldLocator, textToSearch);
        WebElement googlePopUpButtonPanel = locateElement(googlePopUpButtonPanelSelector);
        clickOnElement(googlePopUpButtonPanel, googleSearchButtonSelector);
        return new GoogleSearchResultsWebPage(textToSearch).initializePage();
    }

    public void searchUsingIAmFeelingLuckyButton(String textToSearch) {
        enterValue(searchInputFieldLocator, textToSearch);
        WebElement googlePopUpButtonPanel = locateElement(googlePopUpButtonPanelSelector);
        clickOnElement(googlePopUpButtonPanel, googleIAmFeelingLuckyButtonSelector);
    }

    public SeleniumHQMainWebPage searchForSeleniumHQPageUsingIAmFeelingLuckyButton() {
        searchUsingIAmFeelingLuckyButton("SeleniumHQ");
        return new SeleniumHQMainWebPage().initializePage();
    }

    public GoogleSearchAdsWebPage navigateToGoogleSearchAdvertisingPage() {
        return googleSearchFooterWidget.navigateToGoogleSearchAdvertisingPage();
    }

    public GoogleSearchServicesWebPage navigateToGoogleSearchBusinessPage() {
        return googleSearchFooterWidget.navigateToGoogleSearchBusinessPage();
    }

    public GoogleSearchAboutWebPage navigateToGoogleSearchAboutPage() {
        return googleSearchFooterWidget.navigateToGoogleSearchAboutPage();
    }

    public GoogleSearchHowSearchWorksWebPage navigateToGoogleSearchHowSearchWorksPage() {
        return googleSearchFooterWidget.navigateToGoogleSearchHowSearchWorksPage();
    }
}
