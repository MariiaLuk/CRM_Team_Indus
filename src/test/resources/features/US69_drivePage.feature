Feature: Drive Page module functionality
  Agile Story: As a user, I want to access the Drive page.

  @wip_anna
  Scenario Outline: Verify the users view all options in Drive Page module
    Given the user is on the login page
    When the user logged in with username as "<username>" and password as "<password>"
    When users click the Drive page module on the homepage
    Then verify the users see 6 options:
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's Documents |
      | Drive CLeanup              |

    Examples: login as different users
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | marketing1@cybertekschool.com | UserUser |
