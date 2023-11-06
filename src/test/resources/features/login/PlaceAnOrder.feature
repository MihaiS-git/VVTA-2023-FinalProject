Feature: Place an Order Feature

  @placeAnOrder
  Scenario Outline: Place an Order
    Given I am on the Home Page
    When I click the Login button
    And I enter the username "strugure"
    And I enter the password "strugure"
    And I click the Log in button
    And I click the Cart button
    And I click the Place Order button
    And I enter the Name <name>
    And I enter the Country <country>
    And I enter the City <city>
    And I enter the Credit Card <card>
    And I enter the Month <month>
    And I enter the Year <year>
    And I click Purchase button
    Then I should see the <string> thank you message
    And I click Ok button
    And I click the Log out button
    Examples:
      | name     | country  | city | card                | month | year | string                        |
      | Strugure | Podgorie | Vie  | 1234.5678.9012.3456 | 12    | 2028 | "Thank you for your purchase!" |
      | Strugure | Podgorie | Vie  | 1234.5678.9012.3456 | 12    |      | "Thank you for your purchase!" |
      | Strugure | Podgorie | Vie  | 1234.5678.9012.3456 |       |      | "Thank you for your purchase!" |
      | Strugure | Podgorie |      | 1234.5678.9012.3456 |       |      | "Thank you for your purchase!" |
      | Strugure |          |      | 1234.5678.9012.3456 |       |      | "Thank you for your purchase!" |
