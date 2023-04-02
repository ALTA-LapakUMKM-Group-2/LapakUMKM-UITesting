
Feature: Login
  @Login
  Scenario: Login With Valid Email And Password
    Given Open the website LapakUMKM
    When input email "tes9@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page

