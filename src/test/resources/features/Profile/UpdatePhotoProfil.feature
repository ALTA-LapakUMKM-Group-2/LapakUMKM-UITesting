Feature: Update photo profile

  @PhotoProfile @Team2
  Scenario: Update photo profile with new image
    Given Open the website LapakUMKM
    When input email "tes9@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click on photo profile
    Then user click on choose file
    And user click button Perbarui Profile Photo
    And photo profile success to update