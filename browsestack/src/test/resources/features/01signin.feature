Feature: Signin

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters valid username and password
    Then successful login