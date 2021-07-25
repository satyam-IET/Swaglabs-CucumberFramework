@Login
Feature: Login Feature
  Description: This feature will be used to login to Simplilearn Application

  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the Swaglab application
    When User enters username "<UserName>"
    And User enters password "<Password>"
    And User clicks on Login button
    Then User should be landed on the Products Page
    
    Examples: 
      | UserName     | Password |
      | standard_user| secret_sauce|
      
  
  Scenario Outline: Verify that when user enters Wrong user name and password they should be able to login successfully
    Given User has opened the Swaglab application
    When User enters username "<UserName>"
    And User enters password "<Password>"
    And User clicks on Login button
    Then User should be getting the "<Error>"
   
    Examples: 
      | UserName     | Password    | Error                                                                     |    
      | standard_user| secret      | Epic sadface: Username and password do not match any user in this service |