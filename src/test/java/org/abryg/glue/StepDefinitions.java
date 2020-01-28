package org.abryg.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.abryg.BaseWebTest;
import org.abryg.webpages.GoogleSearchMainWebPage;
import org.abryg.webpages.GoogleSearchResultsWebPage;

public class StepDefinitions extends BaseWebTest {

    private GoogleSearchMainWebPage googleSearchMainWebPage;
    private GoogleSearchResultsWebPage googleSearchResultsWebPage;

    @Given("^I am on the Google Search homepage$")
    public void I_am_on_the_google_search_homepage() {
        googleSearchMainWebPage = new GoogleSearchMainWebPage();
        googleSearchMainWebPage.openPage();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void I_search_for(String text) {
        googleSearchResultsWebPage = googleSearchMainWebPage.search(text);
    }

    @Then("^I should see URL \"([^\"]*)\" in search results$")
    public void I_should_see_download_link_on_download_page(String url) {
        assert googleSearchResultsWebPage.isUrlPresentInSearchResults(url);
    }
}
