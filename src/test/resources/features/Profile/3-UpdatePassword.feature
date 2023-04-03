Feature: Update Password

  @Password @Team2
  Scenario: Update password with valid data profile
    Given Open the website LapakUMKM
    When input email "updateData@gmail.com" and password "updateData123456789"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click on edit password
    And user already on update password page
    And user input password lama "updateData123456789"
    And user input password baru "updateData12345678"
    And user click icon eyes in password baru field
    And user input konfirmasi password "updateData12345678"
    And user click icon eyes in konfirmasi password field
    And user click button perbarui password
    And update profile success


  @InvalidPassword @Team2
  Scenario: Update password with valid data profile
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click on edit password
    And user already on update password page
    And user input password lama "12345678910"
    And user input password baru "12345678910"
    And user click icon eyes in password baru field
    And user input konfirmasi password " "
    And user click icon eyes in konfirmasi password field
    And user click button perbarui password
    And button perbarui password cant be click