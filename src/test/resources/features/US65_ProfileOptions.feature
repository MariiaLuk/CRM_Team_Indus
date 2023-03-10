@US65_Reda
Feature:As a user, I should be able to see all the options under the user profile.

  Background:the user logged in to the home page
    Given  the user logged in as "Hr users"

  Scenario: Verify the users view all options under the profile
    Given users are on the homepage
    When users click the profile name
    Then verify the HR users see flowing five options:
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                  |
