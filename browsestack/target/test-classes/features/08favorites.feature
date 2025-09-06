Feature: Favorites

  Scenario: Add product to favorites
    Given user first logged in
    When user adds product to favorites
    Then product should be visible in favorites