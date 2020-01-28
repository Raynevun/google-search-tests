package org.abryg.smoketests;

import org.abryg.BaseWebTest;
import org.abryg.webpages.GoogleSearchMainWebPage;
import org.abryg.webpages.GoogleSearchResultsWebPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

public class GoogleSearchTest extends BaseWebTest {

    private GoogleSearchMainWebPage googleSearchMainWebPage;
    private String seleniumHQPageName = "SeleniumHQ";
    private String seleniumHQPageUrl = "https://selenium.dev/";

    @BeforeMethod(alwaysRun = true)
    public void openGoogleSearchMainWebPage() {
        googleSearchMainWebPage = new GoogleSearchMainWebPage();
        googleSearchMainWebPage.openPage();
    }

    @Step("Search for SeleniumHQ by page name")
    @Test(testName = "Search for SeleniumHQ by page name", groups = "search")
    public void searchForSeleniumHQByPageNameTest() {
        GoogleSearchResultsWebPage googleSearchResultsWebPage = googleSearchMainWebPage.search(seleniumHQPageName);
        assert googleSearchResultsWebPage.isUrlPresentInSearchResults(seleniumHQPageUrl);
    }

    @Step("Search for SeleniumHQ by page URL")
    @Test(testName = "Search for SeleniumHQ by page URL", groups = "search")
    public void searchForSeleniumHQByPageUrlTest() {
        GoogleSearchResultsWebPage googleSearchResultsWebPage = googleSearchMainWebPage.search(seleniumHQPageUrl);
        assert googleSearchResultsWebPage.isUrlPresentInSearchResults(seleniumHQPageUrl);
    }

    @Step("Search for SeleniumHQ using 'Google Search' button")
    @Test(testName = "Search for SeleniumHQ using Google Search button", groups = "search")
    public void searchForSeleniumHQUsingGoogleSearchButtonTest() {
        GoogleSearchResultsWebPage googleSearchResultsWebPage = googleSearchMainWebPage.searchUsingGoogleSearchButton(seleniumHQPageName);
        assert googleSearchResultsWebPage.isUrlPresentInSearchResults(seleniumHQPageUrl);
    }

    @Step("Search for SeleniumHQ using 'I'm Feeling Lucky' button")
    @Test(testName = "Search for SeleniumHQ using 'I'm Feeling Lucky' button", groups = "search")
    public void searchForSeleniumHQUsingIAmFeelingLuckyButtonTest() {
        googleSearchMainWebPage.searchForSeleniumHQPageUsingIAmFeelingLuckyButton();
    }
}
