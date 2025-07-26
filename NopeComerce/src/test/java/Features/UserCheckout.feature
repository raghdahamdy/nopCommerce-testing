Feature: Checkout functionality
  check the functionality of checkout page

  Scenario: Verify that the user can  go to the Checkout page
    Given user is logged in
  When clicks on the product to add to cart and open shopping cart page
     And user not click  checkmark agree with the terms of service and  clicks on checkout button
    And user  clicks on checks mark agree with the terms of service and  clicks on checkout button
   And user  enters billing address "lucinda","hossam","lucinda@gmail.com","Afghanistan","Helwan","Omar","11311","010000000000" and clicks on continue
    And   user selects shipping method Click on  Ground  the continue
    And user selects payment method  Click on   Check  Money Order  then  continue and confirm order
    Then  success order message should be display "Your order has been successfully processed!"





  Scenario: Checkout as guest

    When clicks on the product to add to cart and open shopping cart page
    And user  clicks on checks mark agree with the terms of service and  clicks on checkout button
    And selects Checkout as Guest
    And user  enters billing address "lucinda","hossam","lucinda@gmail.com","Afghanistan","Helwan","Omar","11311","010000000000" and clicks on continue

    And   user selects shipping method Click on  Ground  the continue
    And user selects payment method  Click on   Check  Money Order  then  continue and confirm order
    Then  success order message should be display "Your order has been successfully processed!"



  Scenario: Invalid email during checkout
    Given user is logged in
    When clicks on the product to add to cart and open shopping cart page
    And user  clicks on checks mark agree with the terms of service and  clicks on checkout button
    And enters an empty email in the billing address  and tries to continue

    Then the system should display  an error message "Please enter a valid email address."

  Scenario: Checkout with empty cart
    Given user is logged in
    When  clicks on cart link  the cart is empty
    Then the system should display  error message " your cart is empty "




