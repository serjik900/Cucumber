Feature: Add employee
  @sprint3 @regression
  Scenario: Adding one employee
    Given user is navigated to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    When user clicks on PIM option
    And user clicks on employee button
    And user enter first name and lastname
    And user clicks on save buttom
    Then emploee added seccessfully