package org.abryg.webpages;

import org.openqa.selenium.By;

import static org.abryg.Browser.EDGE;
import static org.abryg.Browser.IE;

public class GoogleSearchResultsWebPage extends AbstractGoogleWebPageWithSearch {

    protected String textToSearch;
    private By searchResultsNavigationBarSelector = By.id("navcnt");

    public GoogleSearchResultsWebPage(String textToSearch) {
        super(textToSearch + " - Szukaj w Google", "#q=" + textToSearch + "&*");

        if (getBrowser().equals(IE) || getBrowser().equals(EDGE)) {
            setPageTitle(textToSearch + " - Google Search");
        }

        this.textToSearch = textToSearch;
    }

    @Override
    public GoogleSearchResultsWebPage initializePage() {
        super.initializePage();
        locateElement(searchResultsNavigationBarSelector);
        return this;
    }

    public boolean isUrlPresentInSearchResults(String url) {
        return isElementPresent(By.cssSelector("a[href='" + url + "']"));
    }

    public void navigateToSearchResultByUrl(String url) {
        clickOnElement(By.cssSelector("a[href='" + url + "']"));
    }

    public boolean isSeleniumHQUrlPresentInSearchResults() {
        return isUrlPresentInSearchResults("https://selenium.dev/");
    }

    public SeleniumHQMainWebPage navigateToMainSeleniumHQWebPage() {
        navigateToSearchResultByUrl("https://selenium.dev/");
        return new SeleniumHQMainWebPage().initializePage();
    }
}
