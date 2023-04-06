
Feature: Login
  @Login
  Scenario: Login With Valid Email And Password
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page

