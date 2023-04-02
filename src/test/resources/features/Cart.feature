Feature: Cart
  @Cart
  Scenario: Verify button Cart
    Given Open the website LapakUMKM
    When input email "alya@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page
    Then Click cart on product
    Then Click add to cart
    And Already on Cart Page