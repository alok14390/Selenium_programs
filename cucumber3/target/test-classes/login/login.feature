Feature:Test skillrary
1)Valid Case
2)Invalid Case
Background:
Given i should be login page
@PositiveTesting
Scenario:test the login funactionality
When Enter the username "admin"
And Enter the password "admin"
And Click on the login button
Then I should see the title as "SkillRary Ecommerce"
@NegativeTesting
Scenario: Test the login funcationality
When Enter the username "alok"
And Enter the password "<alok"
And Click on the login button
Then I should see the title as "SkillRary Ecommerce"
 

