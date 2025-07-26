Feature: Search Functionality
user checks the functionality of search
  Scenario: Verify that the user can search with  existing product by Full Name
    Given user is on the home page
    When  user Types Full Name Apple MacBook Pro  in search bar
    And  user clicks on  Search button
    Then Product appears in search results
  Scenario: Verify that the user can search with  existing product by partial name
    When  user search using partial product name in search bar
    And  user click on  Search button
    Then Product  will appear in search results
 Scenario: Verify that the user can search with  misspelled product name and with special characters
   When  user types MakBook instead of MacBook
   And  user click on  Search button

  Scenario: Verify that the user can search  with special characters
    When user tries to search with special characters


  Scenario: Verify that the user can search  with numbers
    When user tries to search with numbers
    Then an error message will display

Scenario: Verify that the user can click on search button without any input
  When The user clicks the search button without entering a keyword
    Then An alert message should be displayed with text "Please enter some search keyword"
