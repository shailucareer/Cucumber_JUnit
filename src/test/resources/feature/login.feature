Feature: feature to test login functionality

  Scenario: Check login is successfull with valid credentials

    Given user is on login page
    When user enters username and pwd
    And clicks on login button
    Then user is navigated on home page
