Feature: Update profile

  @Profile @Team2
  Scenario: Edit profile with valid data profile
    Given Open the website LapakUMKM
    When input email "emailBaruu@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click on edit profile
    And user already on update profile page
    And user input nama lengkap "nama terbaru"
    And user input alamat lengkap "jalan pisang"
    And user input email "emailBaruu@gmail.com"
    Then user input nomor "089654321000"
    And user click button Perbarui Profile
    And update profile success new name "nama terbaru"


  @InvalidProfile @Team2
  Scenario: Edit profile with valid data profile