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

@All
Feature: Uber Booking Feature
  I want to use this template for my feature file

	@Smoke
  Scenario: Booking Cab Sedan
    Given User wants to select a car type "Sedan" from uber application
    When user select cas "Sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 Rs
    #Then user checks the trip details # For missing feature error

	@Regression    
  Scenario: Booking Cab SUV
    Given User wants to select a car type "SUV" from uber application
    When user select cas "SUV" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1200 Rs
    
  @Prod @Regression
  Scenario: Booking Cab Mini
    Given User wants to select a car type "Mini" from uber application
    When user select cas "Mini" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 800 Rs
    
