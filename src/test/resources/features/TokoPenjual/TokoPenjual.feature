@Team2
Feature: Toko penjual page functionality

  Scenario: user add product to keranjang on page toko penjual
    Given user already login
    And user already on page toko penjual
    When user chose product and clik title product
    Then user direct to see detail product
    And user click button tambah keranjang
    And user succesfuly add product to keranjang

  Scenario: user buy product by bayar langsung on page toko penjual
    Given user already login
    And user already on page toko penjual
    When user chose product and clik title product
    Then user direct to see detail product
    And user click button bayar langsung
    And user succesfuly direct to payment

  Scenario: user chat penjual on page keranjang
    Given user already login
    And user already on page toko penjual
    When user click button chat penjual
    And  user click field chat and fill text
    And user click send chat
    Then user succesfuly chat penjual