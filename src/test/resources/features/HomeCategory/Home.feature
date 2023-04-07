@Team2
Feature: Home
  @ButtonProfile
  Scenario: Profile page validation
    Given Open the website LapakUMKM
    When input email "bambang@gmail.com" and password "12345678"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button


    Scenario: Verify Search kaos field
      Given Open the website LapakUMKM
      When input email "bambang@gmail.com" and password "12345678"
      Then click button login
      And already on Dashboard page
      And user click icon search
      And user input "kaos" from input text

  Scenario: Verify Search tas tas field
    Given Open the website LapakUMKM
    When input email "bambang@gmail.com" and password "12345678"
    Then click button login
    And already on Dashboard page
    And user click icon search
    And user input "tas" from input text

  Scenario: Verify Search sepatu tas field
    Given Open the website LapakUMKM
    When input email "bambang@gmail.com" and password "12345678"
    Then click button login
    And already on Dashboard page
    And user click icon search
    And user input "sepatu" from input text

  Scenario: Verify Search baju field
    Given Open the website LapakUMKM
    When input email "bambang@gmail.com" and password "12345678"
    Then click button login
    And already on Dashboard page
    And user click icon search
    And user input "baju" from input text

  @kaos
    Scenario: Verifiy Button darkmode
      Given Open the website LapakUMKM
      When input email "bambang@gmail.com" and password "12345678"
      Then click button login
      And already on Dashboard page
      And user click button dark mode

      Scenario: Verify Cart Button
        Given Open the website LapakUMKM
        When input email "bambang@gmail.com" and password "12345678"
        Then click button login
        And already on Dashboard page
        And user click Cart Button


