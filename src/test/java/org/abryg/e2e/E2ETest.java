package org.abryg.e2e;

import org.abryg.BaseWebTest;
import org.abryg.webpages.GoogleSearchMainWebPage;
import org.abryg.webpages.GoogleSearchResultsWebPage;
import org.testng.annotations.Test;

public class E2ETest extends BaseWebTest {

    @Test(testName = "E2E Test", groups = "E2E")
    public void e2eTest() {
        GoogleSearchMainWebPage googleSearchMainWebPage = new GoogleSearchMainWebPage();
        googleSearchMainWebPage.openPage();
        GoogleSearchResultsWebPage googleSearchResultsWebPage = googleSearchMainWebPage.searchForSeleniumHQ();
        googleSearchResultsWebPage.navigateToMainSeleniumHQWebPage();
    }
}
