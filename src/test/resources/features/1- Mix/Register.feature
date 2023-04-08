@Team2
Feature: Register
  @Register
  Scenario: Register with valid data
    Given open the website Lapak UMKM
    When click the profile icon
    Then click enter icon
    And already on the login page
    And click regis button
    Then already on the register page
    And input full name "AA toufik idaman ukhti" and email "taarufyuk@gmail.com" and password "sayangkamu1234567890"
    Then click register button
    And already on dashboard page