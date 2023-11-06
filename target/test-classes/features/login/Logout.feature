Feature: Logout Feature

  @Logout
  Scenario Outline: Logout
    Given I am on the Home Page
    When I click the Login button
    And I enter the username <username>
    And I enter the password <password>
    And I click the Log in button
    And I click the Log out button
    Then I should find the Login button on the page
    Examples:
      | username   | password   |
      | "strugure" | "strugure" |

