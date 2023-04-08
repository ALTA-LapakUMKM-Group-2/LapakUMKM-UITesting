@Team2
Feature: Category Button
  @Login
  Scenario: Verify button Sedang Tren
    Given Open the website LapakUMKM
    When input email "tes9@gmail.com" and password "123456"
    Then click button login
    When user click button Sedang Tren field
    Then button Sedang Tren can be click

    Scenario: Verify button Fashion
      Given Open the website LapakUMKM
      When input email "tes9@gmail.com" and password "123456"
      Then click button login
      When user click button Sedang Tren field
      Then button Fashion Page can be click

      Scenario: Verify button Game & Hobi
        Given Open the website LapakUMKM
        When input email "bambang@gmail.com" and password "12345678"
        Then click button login
        When user click button Sedang Tren field
        Then button Game & Hobi can be click

        Scenario: Verify button Sepatu & Sandal Page
          Given Open the website LapakUMKM
          When input email "bambang@gmail.com" and password "12345678"
          Then click button login
          When user click button Sepatu & Sandal field
          Then button Sepatu & Sandal can be click

          Scenario: Verify button Alat Rumah tangga
            Given Open the website LapakUMKM
            When input email "bambang@gmail.com" and password "12345678"
            Then click button login
            When user click button Alat Rumah Tangga field
            Then button Alat Rumah Tangga can be click




