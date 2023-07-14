Feature: Test Scenario

  Scenario: Check Show dropdown and quantity of products
    Given I am on the main page
    When I hover over Desktops
    And I click on Desktops
    And I click on Show All Desktops
    Then I check that the value in Show dropdown is 10
    Then I check that Sort by value is Default
    Then I check a quantity of products on page
    When I select 25 from show dropdown
    Then I check a quantity of products on page after 25 selected in show dropdown
    Then I check text Showing 1 to 12 of 12 1 Pages
