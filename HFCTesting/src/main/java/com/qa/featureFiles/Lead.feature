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

Feature: Check whether the lead page is working properly

Background:
    Given open the browser and enter the url
    When Enter valid username and password for login
    Then Check page redirect to franchises list page 
		Then Select users option under impersonate as at right of three dot
		Then Check the page redirect to home dashboard page

@LeadList	
Scenario: Check whether current page is Lead list page or not
		Then Select Sales icon from left navigation and check the page is displaying lead list page
		Then Close the browser
		
@AddLead
Scenario: Check whether we can create a new lead
		Then Select Sales icon from left navigation and check the page is displaying lead list page
		Then Click Add Lead button and check the page redirected into corresponding page
		Then Enter the values in all the fields and save the record
		Then Close the browser
