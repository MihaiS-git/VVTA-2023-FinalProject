Feature: Add Products To Cart Feature

  @addProductsToCart
  Scenario Outline: Add Products To Cart
    Given I am on the Home Page
    When I click the Login button
    And I enter the username <username>
    And I enter the password <password>
    And I click the Log in button
    And I click the title of a product
    And I click the Add to cart button
    Then I should see the <string> message
    Examples:
      | username   | password   | string           |
      | "strugure" | "strugure" | "Product added." |
