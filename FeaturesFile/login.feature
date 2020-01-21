Feature: stock accounting login validation


Scenario: AplicationLogin Validation
	When  Open Browser
	When Open Application
	When Wait for Username
	When Enter Username
	And Wait for password
	And Enter password
	And Wait for password
	When Click  on Login
	When Wait for Logout
	When Click on Logout
	When Wait for OK
	When Click on OK
	When CloseBrowser
	