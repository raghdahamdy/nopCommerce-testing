Feature: User Login
  This feature checks that a user can login successfully

#  Scenario: User should login with valid credentials
#    Given the user is on the home page
#    When the user clicks on the login button
#    And the user enters a valid username and password
#    Then the user should be logged in successfully

  Feature: Invalid Login
  Validate that the user cannot login with invalid credentials

  Scenario Outline: User should login with invalid credentials
    Given the user is on the home page
   When the user clicks on the login button
    And  the user enters "<Email>","<Password>"
    Then error message"<errorLogin>" should be displayed
    Examples:
      | Email               | Password  | errorLogin                      |
      | raga@gmailcom       | 123456    | Invalid Email                    |
      | raghda@gmail.com    | 1234545   | Invalid Password                 |
      |                    | 1234545   | Email is empty                   |
      | raghda@gmail.com    |           | Password is empty                |
      | roka@gmailcom       | 123456    | Unregistered Email              |
