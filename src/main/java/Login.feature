Feature: Login Feature
  Description: This feature will be used to login to Simplilearn Application

  @PositiveLogin @Sanity
  Scenario Outline: Verify that when user enters correct user name and password they should be able to login successfully
    Given User has opened the Swaglab application
    When User enters correct username "<UserName>"
    And User enters correct password "<Password>"
    And User clicks on Login button
    Then User should be landed on the home Page
    And User should be able to see the welcome message

    Examples: 
      | UserName     | Password |
      | standard_user| secret_sauce|
      
  @NegativeveLogin @Sanity
  Scenario Outline: Verify that when user enters Wrong user name and password they should be able to login successfully
    Given User has opened the Swaglab application
    When User enters wrong username "<UserName>"
    And User enters wrong password "<Password>"
    And User clicks on Login button
    Then User should not be able to login
    And User should get error message

    Examples: 
      | UserName     | Password |
      | standard_user| secret_sauce|