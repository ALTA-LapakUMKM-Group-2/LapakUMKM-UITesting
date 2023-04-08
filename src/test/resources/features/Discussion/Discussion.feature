
Feature: Discussion functionality

  @Discussion @Team2
  Scenario: user send message product for discussion with five word
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    And  user lick on the product
    When user input on the text area filix with five word "Apakah barangnya saat ini ada?"
    Then user click on the button Kirim
    And verify message success to send


  @Discussion @Team2
  Scenario: user send message product for discussion with one word
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    And  user lick on the product
    When user input on the text area filix with one word "ada?"
    Then user click on the button Kirim
    And verify message success to send


  @Discussion @Team2
  Scenario: user send message product for discussion with one hundred word
    Given Open the website LapakUMKM
    When input email "akun201@gmail.com" and password "1234567890"
    Then click button login
    And already on Dashboard page
    And  user lick on the product
    When user input on the text area filix with one hundred word "Pagi buta yang dingin, membuat semua orang malas bekerja seperti biasanya. Seperti pria paruh baya yang hanya penganguran ini. Hari-harinya hanya bermalas-malasan. Sementara anak semata wayang dan istrinya berusaha menghidupi keluarga. Tak kenal lelah mencari nafkah halal kesana kemari. Sebut saja “Pak Jum”, ia hanya membentak, meminta ini dan itu tanpa pernah member nafkah. Anaknya saja berhenti bersekolah. Tak punya hati sudah. Manusia setan durjana.Ketika terik membakar kulit pekerja keras. Beliau duduk santai dengan asap-asap  yang meyekat perokok pasif. Membuat hutang keluarga semakin menumpuk. Hingga malam menyapa beliau tidak sedikitpun mencari keluarganya. Saat istri dan anaknya kembali membawa makan, “Ini makan buat saya, kan!” membentak hingga anaknya menangis dan diam karena takut dipukuli. Hanya diam dan sabar yang mereka lakukan setiap hari melawan ‘Pak Jum’.Malam sunyi itu, dia marah karena tak ada uang sepeserpun di almari. Dia mencaci dan memukuli istrinya hingga berdarah-darah. “Ayah hanya bisa meminta tak pernah bekerja! Menghamburkan uang dan menyiksa kami! Hati ayah batu!” anaknya menjerit menangis bersujud di telap kaki ayahnya menghentikan penyiksaan.Bungkam bibir ayahnya. Tertunduk menyadari kesalahannya . Memohon maaf dan beliau berjanji untuk menafkai mereka. Sendu malam itu, mereka bersujud pada Allah memohon perubahan yang baik dalam pelukan hangat."
    Then user click on the button Kirim
    And verify message success to send