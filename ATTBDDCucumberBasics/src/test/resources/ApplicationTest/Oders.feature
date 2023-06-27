Feature: Order Functionality
Background: 
Given user should be logged into the application
When user should be at orders page

Scenario: Fetching previously placed order information
When user clicks on past order button
Then user should able to see the past order information

Scenario: Fetching current placed order information
When user clicks on current order button
Then user should be able to see the current order information

Scenario: Fetching Cancelled order information
When user clicks on cancelled order button
Then user should be able to see the cancelled order information
