Feature: Contatc form submition Feature

Scenario:  Contact form submition test

Given user is already on contact page 
Then user enter contact details 
|UserName|Email      |MobileNo  |Message|
|tester  |test@gmail.com|2323232323|test|
Then user click on submit button
Then close browser

