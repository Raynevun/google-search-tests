package org.abryg.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchOurStoriesWebPage extends AbstractGoogleWebPage {

    @FindBy(css = "li > a[href='../'")
    private WebElement aboutLink;

    @FindBy(css = "li > a[href='../products/'")
    private WebElement ourProductsLink;

    @FindBy(css = "li > a[href='../stories/'")
    private WebElement ourStoriesLink;

    public GoogleSearchOurStoriesWebPage() {
        super("Nasze historie - Google", "stories/");
        setBaseUrl("https://about.google/");
        PageFactory.initElements(getWebDriver(), this);
    }

    @Override
    public GoogleSearchOurStoriesWebPage initializePage() {
        super.initializePage();
        aboutLink.isDisplayed();
        ourStoriesLink.isDisplayed();
        ourStoriesLink.isDisplayed();
        return this;
    }
}
