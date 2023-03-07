@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "Hr users"
   # or we can use :
   # Given the user logged in with username as "hr1@cybertekschool.com" and password as "UserUser"

  @profile
  Feature: As a user, I should be able to see all the options under the user profile.

  @US65_TC77
  Scenario: Verify the HR users view all options under the profile
    Given HR users are on the homepage
    When users click the profile name
    Then Verify the users see flowing options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |



