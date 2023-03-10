@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in as "Hr users"
   # or we can use :
   # Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"


  @wip
  Scenario: User login with invalid credentials
    Given the user is on the login page
    When User Enter an invalid "hrusers@gmail.com" or "user123"
    And Click the Login In button
    Then verify user see "Incorrect login or password"

