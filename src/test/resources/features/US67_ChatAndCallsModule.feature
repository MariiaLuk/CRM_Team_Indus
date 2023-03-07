Feature: Chat and Calls module functionality
  Agile Story: User should be able to access and view all options in the Chat and Calls module

  @B28G22-99 @lana
  Scenario Outline: Verify the users view all options in the Chat and Calls module
    Given the user is on the login page
    When the user logged in with username as "<username>" and password as "<password>"
    When users click the Chat and Calls module on the homepage
    Then verify the users see 4 options:
      | Message         |
      | Notifications   |
      | Settings        |
      | Activity Stream |

    Examples: login as different users
      | username                      | password |
      | hr6@cybertekschool.com        | UserUser |
      | helpdesk4@cybertekschool.com  | UserUser |
      | marketing8@cybertekschool.com | UserUser |

