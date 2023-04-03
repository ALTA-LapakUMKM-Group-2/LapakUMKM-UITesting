Feature: Detail transaksi

  @DetailTransaction @Team2
  Scenario: Login With Valid Email And Password
    Given Open the website LapakUMKM
    When input email "tes9@gmail.com" and password "123456"
    Then click button login
    And already on Dashboard page
    When user click one product
    And user click button Bayar langsung
    Then user click button confirm and pay
    And user already on History Pembelian page
    Then user click on button detail transaction
    And user direct modal detail transaction
    And user click button Berikan Ulasan
    And user input "bahannya sangat bagus sekali"
    And user send ulasan
