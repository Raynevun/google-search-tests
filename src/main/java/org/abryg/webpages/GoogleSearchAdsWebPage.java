package org.abryg.webpages;

public class GoogleSearchAdsWebPage extends AbstractGoogleWebPage {

    public GoogleSearchAdsWebPage() {
        super("Google Ads – Zyskaj nowych klientów dzięki łatwym w konfiguracji reklamom online", "");
        setBaseUrl("https://ads.google.com/");
    }

    @Override
    public GoogleSearchAdsWebPage initializePage() {
        super.initializePage();
        return this;
    }
}
