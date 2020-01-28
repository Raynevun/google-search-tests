package org.abryg.webpages;

public class GoogleSearchHowSearchWorksWebPage extends AbstractGoogleWebPage {

    public GoogleSearchHowSearchWorksWebPage() {
        super("Google Search - Discover How Google Search Works", "search/howsearchworks/");
        setBaseUrl("https://www.google.com/");
    }

    @Override
    public GoogleSearchHowSearchWorksWebPage initializePage() {
        super.initializePage();
        return this;
    }
}
