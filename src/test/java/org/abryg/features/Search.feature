Feature: Google search results verification

  Scenario: I am looking for SeleniumHQ website in Google search
    Given I am on the Google Search homepage
    When I search for "SeleniumHQ"
    Then I should see URL "https://selenium.dev/" in search results
