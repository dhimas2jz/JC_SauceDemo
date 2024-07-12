Feature: User Login Admin

  Scenario: Field Username dan Password Benar
   	Given TC01_Berada Di Halaman Login
   	When TC02_Isi username
    When TC03_Isi password
    And TC04_Klik button login
    Then TC05_Validasi masuk ke halaman utama
   