Feature: Orange CRM Home Page
	Scenario Outline: Login to the CRM
	
	Given User already in singup for CRM page
	When User navigates to CRM Page
	And Enter correct username and password
	Then verify home page should be displayed
	And user closes the browser