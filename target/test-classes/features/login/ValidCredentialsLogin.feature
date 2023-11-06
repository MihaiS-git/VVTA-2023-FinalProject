Feature: Valid Credentials Login Feature

  @validLogin
  Scenario: Login with valid credentials
    Given I am on the Home Page
    When I click the Login button
    And I enter the username "strugure"
    And I enter the password "strugure"
    And I click the Log in button
    Then I should see the "Welcome strugure" welcome message