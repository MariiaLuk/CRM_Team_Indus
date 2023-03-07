@loginRA
Feature: As a user, I should be able to log in to the with valid credentials
  Scenario: Verify login with valid credentials
    Given user on the login page

    When user use username "<username>" and passcode "<password>"

    And user click the login button

    Then verify the user should be at the home page
