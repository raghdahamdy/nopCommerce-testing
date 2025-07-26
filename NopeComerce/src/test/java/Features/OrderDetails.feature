
  Feature: Review Order Details

Scenario: Verify that the user can  review the order details  and print InVoice
  Given user is logged in

  When the user clicks on the Orders button  then on the Details button
  And the user clicks on the Print button and print


    Scenario: Verify that the user can reorder the previous order
      Given user is logged in
      When the user clicks on the Orders button  then on the Details button
      And  the user clicks on the reorder button
      Then  the user redirects to the shopping cart page