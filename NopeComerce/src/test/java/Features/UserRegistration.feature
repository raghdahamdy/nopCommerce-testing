@register
Feature: User registration
  Check the functionality of user registration

  Scenario: User can register successfully
    Given user is on the home page
    When user clicks on the register button
   And user enters valid credentials
    Then user should be registered successfully

Feature: Invalid registration
  Validate that the user cannot register with invalid credentials
  Scenario Outline: User cannot register with invalid data or missing inputs
    Given user is on the home page
    When user clicks on the register button
    And user enters "<FirstName>","<LastName>","<Email>","<Password>","<ConfirmPassword>"
    Then error message "<expectedError>" should be displayed
    Examples:
      | FirstName | LastName | Email         | Password | ConfirmPassword | expectedError                                                           |
      |           | Ahmed    | test@test.com | 123456   | 123456          | First name is required.                                                 |
      | Raghda    |          | test@test.com | 123456   | 123456          | Last name is required.                                                  |
      | Raghda    | Ahmed    |               | 123456   | 123456          | Email is required.                                                      |
      | Raghda    | Ahmed    | test@test.com |          | 123456          | The password and confirmation password do not match.                    |
      | Raghda    | Ahmed    | test@test.com | 123456   |                 | Password is required.                                                   |
      | Raghda    | Ahmed    | test@test.com | 123      | 123             | Password must meet the following rules: must have at least 6 characters |
      | Raghda    | Ahmed    | test@test.com |    234567890123456789012345678901234567890123456789012345678901234567890      | 234567890123456789012345678901234567890123456789012345678901234567890           | Password must meet the following rules: must have at least 6 characters |
      | Raghda    | Ahmed    | test@test.com | 123456   | 654321          | The password and confirmation password do not match.                    |








