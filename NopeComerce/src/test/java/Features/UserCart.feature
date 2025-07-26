Feature: Cart Functionality
check the functionality of  the cart
  Scenario: Verify that the user can add product to cart
   Given user is on the home page to add product to cart
    When  user clicks on the product

     And  use clicks on add to cart button more than one time
     And  selects another product
     And  user tries to change quantity of the product
     And  user checks unit price and total
    And  user tries to remove product from cart
     And  user tries to apply valid coupon code
     And  user tries to apply invalid coupon code
    Then  the product should add to cart successfully
 Scenario: Verify that the user can add maximum quantity of product to cart

  Given user is on the home page to add product to cart
  When  user clicks on a product
  And  user tries to add maximum  quantity of the product
  Then an error message will be display









