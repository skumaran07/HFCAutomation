#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Impersonate in Admin control panel

Background: 
    Given open the browser and enter the url
    When Enter valid username and password for login
    Then Check page redirect to franchises list page
    
Scenario: Verify the franchise enter through impersonate
		Then Select users option under impersonate as at right of three dot
		Then Check the page redirect to home dashboard page
		Then Close the browser
		 

