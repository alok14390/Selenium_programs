Feature: Test OrangeHRM  
Scenario: To test login functionality
Given I should go to the login page  
And Enter the username "Admin"
And Enter the password "admin123"
And Click on the login button
Then I should see the username as "OrangeHRM"  