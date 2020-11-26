Feature: Cucumber Denemesi

  Scenario: Login with valid username and password

  Given Navigate to Website

    And  Enter Ad and Soyad

      And Enter E-posta

        And Enter Telefon Numarasi

          And Choose one of the hangisi options

            When Click Gonder button

              Then Verify the success text


    # Gherkin = Given, When, And ve Then
    # Bu kelimeler sadece senaryonun anlaşılabilmesi için varlar.
    # Herhangi bir komutu ya da başka işlevi yok.
    # Asıl önemi herkesin senaryoyu anlayabilmesi.

  # senaryo yazılımda . "" , gibi simgeler çıktıda farklı gözükür.