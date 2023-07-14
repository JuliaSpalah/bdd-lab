Feature: Test Scenario

  Scenario: Check current currency sign
    Given I am on the main page
    Then I check a current currency sign

  Scenario: Check Iphone currency and prices
    Given I am on the main page
    When I click on Iphone on Main Page
    Then I check Iphone price in Dollars
    When I click on a currency sign
    And I select EUR currency
    Then I check Iphone price in EUR
    When I click on a currency sign 2
    And I select GBP currency
    Then I check Iphone price in GBP