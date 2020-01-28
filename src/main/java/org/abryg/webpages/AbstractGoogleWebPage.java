package org.abryg.webpages;

public abstract class AbstractGoogleWebPage extends AbstractWebPage {

    public AbstractGoogleWebPage(String pageTitle, String baseUrlSuffix) {
        super(pageTitle, "https://www.google.pl/", baseUrlSuffix);
    }

    @Override
    public AbstractGoogleWebPage initializePage() {
        super.initializePage();
        return this;
    }
}
