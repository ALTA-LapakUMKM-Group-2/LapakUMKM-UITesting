@Team
Feature: Produk penjual page functionality

#  Scenario: user tambah produk with valid data
#    Given user already login
#    And user already on page product penjual
#    When user click button tambah produk
#    And user fill data tambah produk with valid data
#    And user click submit
#    Then user succesfuly tambah produk with valid data
#    And user see new produk on produk penjual page
#
#  Scenario: user tambah produk with invalid data
#    Given user already login
#    And user already on page product penjual
#    When user click button tambah produk
#    And user fill data tambah produk with invalid data
#    And user click submit
#    Then user see error gagal
#
#  Scenario:user perbarui produk with valid data
#    Given user already login
#    And user already on page product penjual
#    When user click button perbarui produk
#    And user fill data pebarui with valid data
#    And user click submit
#    Then user succesfuly perbarui produk with valid data
#
#  Scenario: user perbarui produk with invalid data
#    Given user already login
#    And user already on page product penjual
#    When user click button perbarui produk
#    And user fill data pebarui with invalid data
#    And user click submit
#    Then user see pop up request failed

#  Scenario:user delete produk
#    Given user already login
#    And user already on page product penjual
#    When user selects the product and click deleted
#    Then user see pop up konfirmasi click yakin
#    And user succesfully delete produk

  Scenario:user add new photo produk
    Given user already login
    And user already on page product penjual
    When user user selects the product and click photo produk
    Then user see pop up add new photo
    And user click upload foto and choose photo to upload
    And user succesfully add photo produk

  Scenario:
    Given user already login
    And user already on page product penjual
    When user user selects the product and click photo produk
    Then user see pop up add new photo
    And user click upload foto and choose file other extension to upload
    And user see error pop up