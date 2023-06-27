Feature: Login functionality with data
Scenario: Login with valid credentials
Given user it at the login screen
When user enters username as "testuserone"
And user enters password as "Test@1234"
And user click on submit button
Then user should redirect to Home page