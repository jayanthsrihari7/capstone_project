Feature: Delete from Cart

  Scenario: Delete product from cart
    Given user has to add product in the cart
    When user deletes product from the cart
    Then the product is sucessfully deleted