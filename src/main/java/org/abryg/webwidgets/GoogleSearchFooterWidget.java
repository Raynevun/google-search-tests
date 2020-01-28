package org.abryg.webwidgets;

import org.abryg.webpages.GoogleSearchAboutWebPage;
import org.abryg.webpages.GoogleSearchAdsWebPage;
import org.abryg.webpages.GoogleSearchHowSearchWorksWebPage;
import org.abryg.webpages.GoogleSearchServicesWebPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchFooterWidget extends AbstractWebPageWidget {

    private By footerBodyLocator = By.cssSelector("div#fbar");
    WebElement footerBody;

    private By advertisingTabLocator = By.cssSelector("#fsl > a:nth-child(1)");
    private By businessTabLocator = By.cssSelector("#fsl > a:nth-child(2)");
    private By aboutTabLocator = By.cssSelector("#fsl > a:nth-child(3)");
    private By howSearchWorksTabLocator = By.cssSelector("#fsl > a:nth-child(4)");

    public GoogleSearchFooterWidget() {
        super();
    }

    @Override
    public void initializeWidget() {
        footerBody = locateElement(footerBodyLocator);
    }

    public GoogleSearchAdsWebPage navigateToGoogleSearchAdvertisingPage() {
        clickOnElement(advertisingTabLocator);
        return new GoogleSearchAdsWebPage().initializePage();
    }

    public GoogleSearchServicesWebPage navigateToGoogleSearchBusinessPage() {
        clickOnElement(businessTabLocator);
        return new GoogleSearchServicesWebPage().initializePage();
    }

    public GoogleSearchAboutWebPage navigateToGoogleSearchAboutPage() {
        clickOnElement(aboutTabLocator);
        return new GoogleSearchAboutWebPage().initializePage();
    }

    public GoogleSearchHowSearchWorksWebPage navigateToGoogleSearchHowSearchWorksPage() {
        clickOnElement(howSearchWorksTabLocator);
        return new GoogleSearchHowSearchWorksWebPage().initializePage();
    }
}
