Feature: Send message successfully
  Check the functionality of Send Enquiry

  Scenario: Verify that the user can send Enquiry Message to the admin
    Given user is on the home page
    When user clicks on the Contact button
    And user can send Message to the admin
    Then success message should be displayed

  Scenario Outline: Verify that the user cannot send Enquiry Message to the admin with invalid data
    Given user is on the home page
    When user clicks on the Contact button
    And user enters "<yourName>","<yourEmail>","<enquiry>"
    Then contact error message "<unsuccessfullMsg>" should be displayed

    Examples:
      | yourName | yourEmail        | enquiry        | unsuccessfullMsg |
      |          | raghda@gmail.com | update my info | Enter your name  |
      | raghda   |                  | update my info | Enter email      |
      | raghda   | raghda@gmail.com |                | Enter enquiry    |
