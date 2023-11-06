Feature: NonValid Credentials Login Feature

  @nonValidLogin
  Scenario Outline: Login with bad credentials
    Given I am on the Home Page
    When I click the Login button
    And I enter the username <username>
    And I enter the password <password>
    And I click the Log in button
    Then I should see the <string> message
    And I accept the alert
    Examples:
      | username       | password   | string                                   |
      | "tester007777" | "password" | "User does not exist"                    |
      | "strugure"     | "password" | "Wrong password."                        |
      | "strugure"     | ""         | "Please fill out Username and Password." |
      | ""             | "strugure" | "Please fill out Username and Password." |
      | ""             | ""         | "Please fill out Username and Password." |
