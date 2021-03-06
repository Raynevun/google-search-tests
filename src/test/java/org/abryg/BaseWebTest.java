package org.abryg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BaseWebTest {

    protected WebDriver getWebDriver() {
        return WebDriverProvider.INSTANCE.getWebDriver();
    }

    protected Browser getBrowser() {
        return WebDriverProvider.INSTANCE.getBrowser();
    }

    @BeforeSuite
    public WebDriver initializeWebDriver() {
        return getWebDriver();
    }

    @AfterSuite(alwaysRun = true)
    public void closeWebDriver() {
        getWebDriver().quit();
    }
}
