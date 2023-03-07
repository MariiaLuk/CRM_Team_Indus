Feature: Chat and Calls module functionality
  Agile Story: User should be able to access and view all options in the Chat and Calls module

  Background: For all the scenarios users go to the login page
    Given the user is on the login page

  @lana
  Scenario: Verify the users view all options in the Chat and Calls module
  Given the user logged in with username as "hr6@cybertekschool.com" and password as "UserUser"
    When users click the Chat and Calls module on the homepage
    Then verify the users see four options:
      | Message       |
      | Notifications |
      | Settings      |
      | Activity Stream |

  @lana
  Scenario: Verify the users view all options in the Chat and Calls module
    Given the user logged in with username as "helpdesk4@cybertekschool.com" and password as "UserUser"
    When users click the Chat and Calls module on the homepage
    Then verify the users see four options:
      | Message       |
      | Notifications |
      | Settings      |
      | Activity Stream |

  @lana
  Scenario: Verify the users view all options in the Chat and Calls module
    Given the user logged in with username as "marketing8@cybertekschool.com" and password as "UserUser"
    When users click the Chat and Calls module on the homepage
    Then verify the users see four options:
      | Message       |
      | Notifications |
      | Settings      |
      | Activity Stream |
