Feature: Orders

  Scenario: View past orders
    Given user is logged in
    When user search and add his products to cart
    And click on checkout and enter adress
    And navigate to orders page
    Then previous orders should be displayed