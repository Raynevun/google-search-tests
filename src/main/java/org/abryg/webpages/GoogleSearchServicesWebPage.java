package org.abryg.webpages;

public class GoogleSearchServicesWebPage extends AbstractGoogleWebPage {

    public GoogleSearchServicesWebPage() {
        super("Oprogramowanie do zarządzania biznesowego | Rozwiązania Google dla firm – Google",
                "services/");
    }

    @Override
    public GoogleSearchServicesWebPage initializePage() {
        super.initializePage();
        return this;
    }
}
