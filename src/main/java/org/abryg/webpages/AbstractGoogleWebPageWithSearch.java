package org.abryg.webpages;

import org.openqa.selenium.By;

public abstract class AbstractGoogleWebPageWithSearch extends AbstractGoogleWebPage {

    protected By searchInputFieldLocator = By.cssSelector("input.gLFyf");

    public AbstractGoogleWebPageWithSearch(String pageTitle, String baseUrlSuffix) {
        super(pageTitle, baseUrlSuffix);
    }

    @Override
    public AbstractGoogleWebPageWithSearch initializePage() {
        super.initializePage();
        locateElement(searchInputFieldLocator);
        return this;
    }

    public GoogleSearchResultsWebPage search(String textToSearch) {
        enterValue(searchInputFieldLocator, textToSearch);
        submitForm(searchInputFieldLocator);
        return new GoogleSearchResultsWebPage(textToSearch).initializePage();
    }

    public GoogleSearchResultsWebPage searchForSeleniumHQ() {
        return search("SeleniumHQ");
    }
}
