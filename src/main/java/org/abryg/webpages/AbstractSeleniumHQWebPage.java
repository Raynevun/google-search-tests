package org.abryg.webpages;

import org.abryg.webwidgets.SeleniumHQHeaderWidget;

public abstract class AbstractSeleniumHQWebPage extends AbstractWebPage {

    private SeleniumHQHeaderWidget seleniumHQHeaderWidget;

    public AbstractSeleniumHQWebPage(String pageTitle, String baseUrlSuffix) {
        super(pageTitle, "https://selenium.dev/", baseUrlSuffix);
        seleniumHQHeaderWidget = new SeleniumHQHeaderWidget();
    }

    @Override
    public AbstractSeleniumHQWebPage initializePage() {
        super.initializePage();
        seleniumHQHeaderWidget.initializeWidget();
        return this;
    }

    public SeleniumHQMainWebPage navigateToMainSeleniumHQWebPage() {
        return seleniumHQHeaderWidget.navigateToMainPage();
    }
}
