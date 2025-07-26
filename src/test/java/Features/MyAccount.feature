



Feature: check My Account functionality

  Scenario: Verify that the user can update customer info successfully
    Given user  logged in
    When clicks on my account then clicks on customer info
    And  user can change his first name  then clicks save
    And  user leave his first name  then clicks save
    Then  error message will be displayed

Scenario: Verify adding a new address
  Given user  logged in
  When clicks on my account then clicks on customer info
  And clicks on my account then clicks on Addresses
 And user clicks on delete address then save
  And  user clicks on add new address and enter the new address
  Then  successfull message will display


Scenario: Verify that user can change password successfully
  Given user  logged in
  When clicks on my account then clicks on customer info
  When clicks on my account then clicks on change password
  And user enters old password, new password and confirm password then click on confirm
  Then  the system will update the new password


