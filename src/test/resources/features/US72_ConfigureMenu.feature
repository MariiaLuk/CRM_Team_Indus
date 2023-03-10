Feature:As a user, I should be able to configure the menu.

  Background: user is on main dashboard
    Given the user logged in as "Hr users"

  @B28G22-103 @omid2
  Scenario: Verify users can access to 6 options under the CONFIGURE MENU.
    Given users are on the homepage
    When users click the CONFIGURE MENU option
    Then verify the users can see flowing 6 options:
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |
