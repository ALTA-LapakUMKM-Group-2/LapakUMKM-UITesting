@Login
Feature: Login
   As a user i want to login to sauce demo

  Scenario: Normal login
    Given User open login page
    When User input "standard_user" as userName and "secret_sauce" as password
    Then User succesfuly login on landing page

  Scenario Outline: Invalid login
    Given User open login page
    When User input "<userName>" as userName and "<password>" as password
    Then User will see "<errorText>" on login page
    Examples:
      | userName      | password | errorText                                                                 |  |  |
      | asd           |          | Epic sadface: Password is required                                        |  |  |
      | standard_user | 123      | Epic sadface: Username and password do not match any user in this service |  |  |
      | aswsw         | gogo     | Epic sadface: Username and password do not match any user in this service |  |  |