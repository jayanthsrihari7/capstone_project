Feature: Signout

  Scenario: Successful sign out
    Given user first log in
    When user clicks the sign out button
    Then user should be redirected to the login page