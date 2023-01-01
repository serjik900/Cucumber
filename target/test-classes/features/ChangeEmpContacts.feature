Feature: US-18 Change employee contacts feature

  Background:

    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on EmployeeList option

@batch14 @sprint2

  Scenario: Search employee by name
  When user enters valid employee name
  And user clicks on search button

  Scenario: Contact details editor verification
When user clicks on desire contact
  Then contact details
    And user click edit button
Then user verify that Address Street 1 textbox is displayed and user can enter values
    And Address Street 2 textbox is displayed and user can enter values there
    And City textbox is displayed and user can enter values there
    And State/Province textbox is displayed and user can enter values there
    And Zip/Postal Code textbox is displayed and user can enter values there
    And Country textbox is displayed and user can enter values there
    And Home Phone textbox is displayed and user can enter values there
    And Mobile Phone textbox is displayed and user can enter values there
    And Work Phone textbox is displayed and user can enter values there
    And Work Email textbox is displayed and user can enter values there
    And Other Email textbox is displayed and user can enter values there


