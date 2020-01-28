package org.abryg.smoketests;

import org.abryg.BaseWebTest;
import org.abryg.webpages.GoogleSearchMainWebPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

public class GoogleSearchNavigationTest extends BaseWebTest {
    private GoogleSearchMainWebPage googleSearchMainWebPage;

    @BeforeMethod(alwaysRun = true)
    public void openGoogleSearchMainWebPage() {
        googleSearchMainWebPage = new GoogleSearchMainWebPage();
        googleSearchMainWebPage.openPage();
    }

    @Step("Navigate to Advertising page")
    @Test(testName = "Navigate to Advertising page", groups = "navigation")
    public void navigateToProjectsPageTest() {
        googleSearchMainWebPage.navigateToGoogleSearchAdvertisingPage();
    }

    @Step("Navigate to Business page")
    @Test(testName = "Navigate to Business page", groups = "navigation")
    public void navigateToDocumentsPageTest() {
        googleSearchMainWebPage.navigateToGoogleSearchBusinessPage();
    }

    @Step("Navigate to About page")
    @Test(testName = "Navigate to About page", groups = "navigation")
    public void navigateToAboutPageTest() {
        googleSearchMainWebPage.navigateToGoogleSearchAboutPage();
    }

    @Step("Navigate to How Search Works page")
    @Test(testName = "Navigate to How Search Works page", groups = "navigation")
    public void navigateToMainPageTest() {
        googleSearchMainWebPage.navigateToGoogleSearchHowSearchWorksPage();
    }
}
