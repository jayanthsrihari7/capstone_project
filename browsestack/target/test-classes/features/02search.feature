Feature: Search

  Scenario: Search for a product
    Given user is on the homepage
    When user searches for product
    Then search results should display products
