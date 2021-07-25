Feature: Product Feature

 Description: This feature us used to add products to cart in swaglabs Application
 
 Background:
  Given User has opened the Swaglab applications
  When User enters usernames "<UserName>"
  And User enters passwords "<Password>"
  And User clicks on Login buttons
 
 @ProductFeature
 Scenario Outline: Verify user is able to add the single product in cart
 Given User should be landed on product page 
 And User selects product and clicks on add to cart button "<Product>"
 Then User should be able to see product in cart
 
 Examples:
     | Product                 |
     | Sauce Labs Bolt T-Shirt |
     
  
 @DataTable
 Scenario Outline: Verify user is able to add the multiple product in cart 
 Given User should be landed on product page 
 And User selects a multiple product and add to cart
 
   | Sauce Labs Bolt T-Shirt     |
   | Sauce Labs Backpack         |
   | Sauce Labs Bike Light       |
   | Sauce Labs Fleece Jacket    |
   
 Then User should be able to see product in cart
   
   