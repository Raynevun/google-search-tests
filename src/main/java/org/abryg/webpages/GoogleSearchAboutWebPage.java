package org.abryg.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchAboutWebPage extends AbstractGoogleWebPage {

    @FindBy(css = "li > a[href='./'")
    private WebElement aboutLink;

    @FindBy(css = "li > a[href='./products/'")
    private WebElement ourProductsLink;

    @FindBy(css = "li > a[href='./stories/'")
    private WebElement ourStoriesLink;

    public GoogleSearchAboutWebPage() {
        super("Informacje - Google", "");
        setBaseUrl("https://about.google/");
        PageFactory.initElements(getWebDriver(), this);
    }

    @Override
    public GoogleSearchAboutWebPage initializePage() {
        super.initializePage();
        aboutLink.isDisplayed();
        ourStoriesLink.isDisplayed();
        ourStoriesLink.isDisplayed();
        return this;
    }

    public GoogleSearchOurStoriesWebPage navigateToGoogleSearchOurStoriesPage() {
        ourStoriesLink.click();
        return new GoogleSearchOurStoriesWebPage().initializePage();
    }
}
