
Feature: User answar discussion for discussion with click button Balas

  @AnswerDiscussion @Team2
  Scenario: User answar discussion for discussion with click button Balas
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    And  user lick on the product
    Given already chat discussion on detail product
    When user click on balas discussion
    And user input on the text area "bagaimana min?"
    Then user click on the button Balas
    And verify message success to send answer discussion


  @AnswerDiscussion @Team2
  Scenario: User answar discussion for discussion with click button Kembali
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    And  user lick on the product
    Given already chat discussion on detail product
    When user click on balas discussion
    And user input on the text area "bagaimana min?"
    Then user click on the button Kembali
