@Team2 @payment
Feature: Payment

  Scenario: Fungsional button buy
    Given Open the website LapakUMKM
    When input email "alya@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page
    Then Click cart on product
    Then Click add to cart 2
    Then Click Cart
    And Already on Cart Page
    Then Click checkbox
#    And Total Must be 600000
    Then click button beli
    And Already on Payment Page
    Then click button confirm and pay

  Scenario: Fungsional button buy with empty product
    Given Open the website LapakUMKM
    When input email "alya@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page
    Then Click Cart
    And Already on Cart Page
    Then Click checkbox
#    And Total Must be 600000
    Then click button beli
    And Already on Payment Page
    Then click button confirm and pay
