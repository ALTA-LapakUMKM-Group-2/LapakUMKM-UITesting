@Team2
Feature: Detail transaksi

  @DetailTrasaction @Team2
  Scenario: Verify detail transaction
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    When user click sub button Riwayat Belanja field
    And user already on History Pembelian page
    Then user click detail transaction
    And User appear detail transaction


  @PaymentNow @Team2
  Scenario: Verify payment now
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    When user click sub button Riwayat Belanja field
    And user already on History Pembelian page
    Then user click detail button bayar sekarang
    And User direct in payment page