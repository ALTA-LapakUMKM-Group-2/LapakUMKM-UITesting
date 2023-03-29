@Purchase
Feature: Purchase end2end
  As user purchase item with sort product
  Scenario: User sort product with succes order
    Given User already login
    And User already landing page
    When User sort product list by "Name (Z to A)"
    And User add item  "Test.allTheThings() T-Shirt (Red)" and "Sauce Labs Onesie" to cart
    And User click shopping chart icon
    And User remove item "Test.allTheThings() T-Shirt (Red)"
    And User click checkout
    And User input information checkout and continue
    And User verify total price order
    Then User click finish button
    And User succesfully order with text "THANK YOU FOR YOUR ORDER"
