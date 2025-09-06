Feature: Offers

  Scenario: View available offers
    Given user should logged in
    When user navigates to the offers page
    Then available offers should be displayed