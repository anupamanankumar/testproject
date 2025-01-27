Feature: Using Gherkin 

Scenario: Verify Login With Invalid Credentials 
	Given user opens browser and logins to the site 
	When user enters username as "test" 
	And   user enters password as "test" 
	And  user click on the login button 
	Then login fails with the invalid login message 
	And  close the application 
	
Scenario: Reset The Password With Invalid UserName 
	Given user opens browser and logins to the site 
	When user clicks on Forget link 
	Then user gets to Password Reset Page 
	When user enters username as "test" in Password Reset Page 
	And user click on the Reset Password Button 
	Then reset fails with the invalid username message 
	And verify the username message text color is "#a94442" 
	And  close the application 
	#	