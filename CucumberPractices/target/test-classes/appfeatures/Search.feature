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

Feature: Amazon Search


@Smoke
Scenario: Search a Product MacBook Air
Given I have a search field on Amazon page
When I search for a product "Apple MacBook Air" and price 1000
Then Product with name "Apple MacBook Air" should be displayed
Then OrderId is 12345 and user name is "Ankesh"


@Regression
Scenario: Search a Product iPhone
Given I have a search field on Amazon page
When I search for a product "Apple iPhone" and price 1200
Then Product with name "Apple iPhone" should be displayed
Then OrderId is 12346 and user name is "Ankesh"