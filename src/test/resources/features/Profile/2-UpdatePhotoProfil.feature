@Team2
Feature: Update photo profile

  @PhotoProfile
  Scenario: Update photo profile with new image
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    When user click on photo profile
    Then user click on choose file
    And user click button Perbarui Profile Photo
    And photo profile success to update


