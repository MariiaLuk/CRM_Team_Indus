@maria1
Feature: As a user, I should be able to access to the Company page .

  Background: user is on main dashboard
    Given the user logged in as "Hr users"

  @B28G22-106
  Scenario:  Verify users see the 7 modules in the Company page shown as design
    Given users are on the homepage
    When users click the Company module
    Then verify the users see flowing 7 options:
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |


