Feature: Wishlist Functionality
  Check the functionality of wishlist

  Scenario: Verify that the user can add a product to the wishlist
    Given user is on the home page
    When user clicks on Add to wishlist on Apple MacBookPro product
    And user clicks on ADD to wishlist
  And a success message should be displayed
    And user clicks on wishlist button
    And user clicks on update  the wishlist
    And user clicks on send Email from the wishlist
    And user clicks on add product to cart
    Then user clicks on remove product from the wishlist

    Then the system should display a message



