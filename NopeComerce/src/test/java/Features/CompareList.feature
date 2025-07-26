Feature: Compare products list
  Scenario: Verify that the user can Add product to Compare product list
Given user in the homepage and clicks on compare  button of any product
    When user clicks on the compare list link
    Then the product should add to the list successfully
    And  use can remove the product from the list

