package org.abryg.smoketests;

import org.abryg.BaseWebTest;
import org.abryg.webpages.GoogleSearchAboutWebPage;
import org.abryg.webpages.GoogleSearchMainWebPage;
import org.testng.annotations.Test;

public class PageFactoryTest extends BaseWebTest {

    @Test(testName = "Page Factory Example", groups = "pageFactory")
    public void pageFactoryTest() {
        GoogleSearchMainWebPage googleSearchMainWebPage = new GoogleSearchMainWebPage();
        googleSearchMainWebPage.openPage();
        GoogleSearchAboutWebPage googleSearchAboutWebPage = googleSearchMainWebPage.navigateToGoogleSearchAboutPage();
        googleSearchAboutWebPage.navigateToGoogleSearchOurStoriesPage();
    }
}
