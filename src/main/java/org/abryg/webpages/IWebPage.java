package org.abryg.webpages;

import org.abryg.IWebPageSegment;

public interface IWebPage extends IWebPageSegment {

    IWebPage initializePage();

    IWebPage openPage();

    IWebPage refreshPage();

    String getWebPageTitle();

    String getWebPageUrl();

    Boolean verifyWebPageTitle(String expectedWebPageTitle);
}
