Feature: Update profile

  @Profile @Team2
  Scenario: Edit profile with valid data profile
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "123456789"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click on edit profile
    And user already on update profile page
    And user input nama lengkap "Raisa Anggraini"
    And user input alamat lengkap "jl. Warung Tegal"
    And user input email "akun201@gmail.com"
    Then user input nomor "089654321000"
    And user click button Perbarui Profile


  @InvalidProfile @Team2
  Scenario: Edit profile with valid data profile
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "123456789"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click on edit profile
    And user already on update profile page
    And user input nama lengkap "12345"
    And user input alamat lengkap "#####"
    And user input email "emailBaru"
    Then user input nomor "ini nomor salah"
    And user click button Perbarui Profile
    And button cant to be click