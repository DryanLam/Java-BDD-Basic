@Regression
Feature: Automation Demo project

  @AC-0001
  Scenario: Create A New Apppointment
    Given Navigate to home page
    When Click to Appointment button on home page
    And Input username "John Doe" and password "ThisIsNotAPassword"
    And Click to Login button on login page
    Then Verify that "CURA Healthcare Service" page is displayed

  @AC-0002
  Scenario: Create A New Apppointment
    Given Navigate to home page
    When Click to Appointment button on home page
    And Input username "John Doe" and password "ThisIsNotAPassword"
    And Click to Login button on login page
    Then Verify that "CURA Healthcare Service" page is displayed