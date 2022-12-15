Feature:Orange HRM
1)Valid Case
2)Invalid Case
Background:
Given i should be login page
@PositiveTesting
Scenario:test the login funactionality
When Enter the username "Admin"
And Enter the password "admin123"
And Click on the login button
Then I should see the title as "Paul Collings"
@NegativeTesting
Scenario: Test the login funcationality
When Enter the username "alok"
And Enter the password "<alok"
And Click on the login button
Then I should see the title as "Paul Collings"
 

