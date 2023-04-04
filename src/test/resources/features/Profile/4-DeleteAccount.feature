Feature: Update profile

  @Delete @Team2
  Scenario: Delete account success
    Given Open the website LapakUMKM
    When input email "deleteAkun1@gmail.com" and password "deleteAkun123456789"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click button delete account
    Then user click yes

  @InvalidDelete @Team2
  Scenario: Delete account unsuccessful
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    When user click button profile on navbar
    Then user click profile on dropdown sub button
    And  user already on profile page
    When user click button delete account
    Then user click No
    And back to profile page
