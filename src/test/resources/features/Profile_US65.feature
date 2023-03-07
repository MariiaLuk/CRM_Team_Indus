@profile
   Feature:
     As a user, I should be able to see all the options under the user profile.
     Background:the user logged in to the home page
     Given  user locates the profile logo on the top right of the page
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

