@profile
   Feature:
     As a user, I should be able to see all the options under the user profile.
     Background:
     Given the user logged in to the home page
     Then  user locates the profile logo on the top right of the page
     @B28G22-77
     Scenario: Verify the HR users view all options under the profile
       Given HR users are on the homepage
       When users click the profile name
       Then Verify the users see flowing options:
         | My Profile              |
         | Edit Profile Settings   |
         | Themes                  |
         | Configure notifications |
         | Log out                 |

  @B28G22-78
     Scenario: Verify the help desk users view all options under the profile
       Given help desk users are on the homepage
       When help desk users click the profile name
       Then Verify the help desk users see flowing options:
         | My Profile              |
         | Edit Profile Settings   |
         | Themes                  |
         | Configure notifications |
         | Log out                 |

    @B28G22-79
     Scenario: Verify the marketing users view all options under the profile
       Given marketing users are on the homepage
       When marketing users click the profile name
       Then Verify the marketing users see flowing options:
         | My Profile              |
         | Edit Profile Settings   |
         | Themes                  |
         | Configure notifications |
         | Log out                 |
