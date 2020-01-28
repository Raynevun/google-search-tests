package org.abryg.webpages;

public class SeleniumHQMainWebPage extends AbstractSeleniumHQWebPage {

    public SeleniumHQMainWebPage() {
        super("SeleniumHQ Browser Automation", "");
    }

    @Override
    public SeleniumHQMainWebPage initializePage() {
        super.initializePage();
        return this;
    }
}
