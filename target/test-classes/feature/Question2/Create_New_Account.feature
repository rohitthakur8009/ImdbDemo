Feature: Create a new User Registration
  As a user
  I want to be able register
  So that I can create my Account

  Scenario: Register a New User
    Given I am on the Home Page
    When I go to User Sign In Screen
    And I select Create a New Account option
    And I Submit the Registration Information
    Then I am able to see Successfully Register

  Scenario: User able to login with Created Id
    Given I am on Home Page
    When I Sign Out
    Then I am Signed Out Successfully
