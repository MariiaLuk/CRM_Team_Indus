@maria
Feature: As a user, I want to see mobile app options to download.

  Background: user is on main dashboard
    Given the user logged in as "Hr users"


  Scenario:  Verify users can see mobile app options

      Given users are on the homepage
      Then verify the users see flowing 2 mobile app options:
            |  APP STORE       |
            | GOOGLE PLAY |

