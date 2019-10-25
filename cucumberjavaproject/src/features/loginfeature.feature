Feature: Using Gherkin 

Scenario: Verify Login With Invalid Credentials 
	Given user opens browser and logins to the site 
	When user enters username as "test" 
	And   user enters password as "test" 
	Then user click on the login button 
	Then login fails with the invalid login message 
	And  close the application 
	
Scenario: Retrieve Login Crdentials With Invalid UserName 
	Given user opens browser and logins to the site 
	When user enters username as "test" 
	And   user enters password as "test" 
	Then user click on the login button 
	Then login fails with the invalid login message 
	Then retrieve user name and verify the invalid login message text color is "#a94442" 
	And  close the application 
	