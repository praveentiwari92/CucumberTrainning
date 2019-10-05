Feature: Free CRM Login Feature

#With Example
Scenario Outline: Free CRM Login Test case

Given user is already on login page 
When title of login page is My SIP Online Login
Then user enter "<username>" and "<password>"
And user clicks on login button
Then user is on Dashboard page 
Then user click on invest Now Link
Then user click on start Lumpsum Link
Then user Scroll down Page 
Then user click on invest now button
Then user enter amount
Then user select SIP Date
Then user click on Buy Now button
  
 Examples:
 			|username | password|
 			|manojtambolip@gmail.com |123456 |
 			|sonu.cognus@gmail.com |123456 | 