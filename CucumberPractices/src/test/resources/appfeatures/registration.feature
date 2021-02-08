
Feature: User Registration

 
  Scenario: User registration with different data
    Given User is on registration page
    When User enters following user details
    | ankesh | automation | ank@gmail.com  | 9999 | Bangalore |
      | kumar |     cucumber | kumar@gmail.com  | 1111 | London |
      | sharma |     selenium | sharma@gmail.com   | 8888 | SFO |
   
    Then user registration should be successful
