@Team2
Feature: Cart
@alya
  Scenario: fungsional button Cart
    Given Open the website LapakUMKM
    When input email "alya@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page
    Then Click cart on product
    Then Click add to cart 2
    Then Click button home
    Then Click cart on product 2
    Then Click add to cart 2
    Then Click Cart
    And Already on Cart Page
#    Then Click Decrease Cart
    Then Click Increase Cart
    Then Click Delete Cart
    Then Click checkbox
#    And Total Must be 600000
    Then click button beli
    And Already on Payment Page
    Then click button confirm and pay

  Scenario: Fungsional button pay with empty product
    Given Open the website LapakUMKM
    When input email "alya@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page
    Then Click Cart
    Then click button beli
#    And Already on Payment Page


