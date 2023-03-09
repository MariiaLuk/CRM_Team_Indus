@lilit
Feature:  As a user, I should be able to see desktop options to download.

  Background: User is already in the log in page
    Given the user logged in as "Hr users"

  Scenario:  Verify users can see desktop app options
    Given users are on the homeScreen
    Then verify the users see flowing 3 desktop options
      | MAC OS  |
      | WINDOWS |
      | LINUX   |
