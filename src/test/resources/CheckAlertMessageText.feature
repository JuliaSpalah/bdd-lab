Feature: Test Scenario

  Scenario: Check alert message text
    Given I am on the main page
    When I click on my account
    And I click on login
    And I click on forgotten password
    And I set an email into email field
    And I click on a Continue button on Forgotten Password Page
    Then I check an Alert Message text