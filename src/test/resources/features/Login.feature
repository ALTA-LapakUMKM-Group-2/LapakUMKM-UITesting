
Feature: Login
  @Login
  Scenario: Login user
    Given User open the website
    When User click prof button
    Then User click entry button
    And User already on login pages
    Then User input email "quality9@gmail.com" and password "Quality1234"
    And User click button login
    And User already on Dashboard pages