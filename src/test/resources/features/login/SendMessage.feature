Feature: Send Message Feature

  @sendMessage
  Scenario: Send Message
    Given I am on the Home Page
    When I click the Login button
    And I enter the username "strugure"
    And I enter the password "strugure"
    And I click the Log in button
    And I click the Contact button
    And I enter Contact Email "strugure@podgorie.vie"
    And I enter Contact Name "strugure"
    And I enter Message "S-au copt strugurii"
    And I click Send message button
    Then I should see the "Thanks for the message!!" message
    And I accept the alert

