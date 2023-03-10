@Gio
Feature: User logout
  Scenario: User is able to logout successfully
    Given User is logged in
    And User clicks on profile name dropdown on the upper right corner
    When User clicks on logout button
    Then User is able to log out successfully