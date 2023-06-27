Feature: login functionality
Scenario: login with valid credential 
Given user is at login screen
When user enters username
And user enters password
And user clicks on login button
Then User should get logged in

#Scenario: Title verification
#Given user is at the landing page 
#Then Title of page should be pagetitle


 
