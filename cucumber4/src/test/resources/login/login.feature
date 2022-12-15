Feature: Test the skillrary App
1) Valid Case
2) Invalid Case
Background:
Given i should open the browser and naviagte to the login page of skillrary
#@PositiveTesting
#Scenario: To Test the Login with user Credentials
#When Enter Username "user"
#And Enter Password "user"
#And Click on the loginbutton
#Then i should see the username as "Harry Den"
#@PositiveTesting
#Scenario: To Test the Login with Admin Credentials
#When Enter Username "admin"
#And Enter Password "admin"
#And Click on the loginbutton
#Then i should see the admin as "SkillRary Admin"
@PositiveTesting
Scenario Outline: To test login with multiple data
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the loginbutton
Then i should see the username as "<username>"
Examples:
|user|pass|username|
|user|user|harry harry|
|user|user|harry harry|
|admin|admin|SkillRary Admin|
#@stands for tags
@NegativeTesting
Scenario: To Test the Login with invalid Credentials
When Enter Username "sushanta"
And Enter Password "sushanta"
And Click on the loginbutton
Then i should see the "Register"