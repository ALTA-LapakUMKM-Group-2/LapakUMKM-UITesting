Feature: Update Password

  @Password @Team2
  Scenario: Update password with valid data profile
    Given Open the website LapakUMKM
    When input email "emailBaruu@gmail.com" and password "a1b2"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click on edit password
    And user already on update password page
    And user input password lama "a1b2"
    And user input password baru "a1b2c3"
    And user click icon eyes in password baru field
    And user input konfirmasi password "a1b2c3"
    And user click icon eyes in konfirmasi password field
    And user click button perbarui password
    And update profile success


  @InvalidPassword @Team2
  Scenario: Update password with valid data profile
    Given Open the website LapakUMKM
    When input email "emailBaruu@gmail.com" and password "a1b2c3"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click on edit password
    And user already on update password page
    And user input password lama "123456"
    And user input password baru "1234567"
    And user click icon eyes in password baru field
    And user input konfirmasi password " "
    And user click icon eyes in konfirmasi password field
    And user click button perbarui password
    And button perbarui password cant be click