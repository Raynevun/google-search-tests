package org.abryg.webwidgets;

import org.abryg.webpages.SeleniumHQMainWebPage;
import org.openqa.selenium.By;

public class SeleniumHQHeaderWidget extends AbstractWebPageWidget {

    private By headerBodyLocator = By.id("header");
    private By headerTitleLocator = By.cssSelector("img.logo-large");

    public SeleniumHQHeaderWidget() {
        super();
    }

    @Override
    public void initializeWidget() {
        locateElement(headerBodyLocator);
        locateElement(headerTitleLocator);
    }

    public SeleniumHQMainWebPage navigateToMainPage() {
        clickOnElement(headerTitleLocator);
        return new SeleniumHQMainWebPage().initializePage();
    }
}
