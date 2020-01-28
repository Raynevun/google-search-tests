package org.abryg.webpages;

import org.openqa.selenium.By;

public class GoogleSearchRedirectNoticeWebPage extends AbstractGoogleWebPage {

    private By pageTitleSelector = By.cssSelector("font > b");
    private String pageTitleText = "Redirect Notice";
    private String pageUrl;

    public GoogleSearchRedirectNoticeWebPage(String pageUrl) {
        super("Redirect Notice", "url?q=" + pageUrl);
        this.pageUrl = pageUrl;
    }

    @Override
    public GoogleSearchRedirectNoticeWebPage initializePage() {
        super.initializePage();
        locateElement(pageTitleSelector);
        verifyElementText(pageTitleSelector, pageTitleText);
        return this;
    }

    public void acceptRedirectionToPage() {
        clickOnElement(By.cssSelector("a[href='" + this.pageUrl + "']"));
    }

    public SeleniumHQMainWebPage acceptRedirectionToSeleniumHQMainWebPage() {
        this.pageUrl = "https://selenium.dev/";
        acceptRedirectionToPage();
        return new SeleniumHQMainWebPage().initializePage();
    }
}
