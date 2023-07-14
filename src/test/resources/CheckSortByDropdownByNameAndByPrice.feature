Feature: Test Scenario
  Scenario: Check Sort by dropdown
    Given I am on the main page
    When I hover over Desktops
    And I click on Desktops
    And I click on Show All Desktops
    And I select NameA-Z in Sort By dropdown
    Then I check the products` order by Name
    When I select PriceLow<High in Sort By dropdown
    Then I check the products` order by Price