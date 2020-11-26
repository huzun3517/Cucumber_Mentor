@SmokeTest
Feature: Sign in Test

  Scenario Outline: Sign in Testi

    Given Websiteye git

    And Sign in butonuna tikla

    And Email "<Email>" gir

    And Create an Account butonuna tikla

    And Title sec

    And firstname "<Firstname>" ve lastname "<Lastname>" gir

    And password "<Password>" gir

    When Company "<Company>" gir

    Then Adress "<Adress>" gir
    Examples:
      | Email                  | Firstname | Lastname | Password   | Company       | Adress             |
      | omeroz@gmail.com       | Omer      | Ozdemir  | omer123    | Techno  Study | Ricarda Huch weg22 |
      | cigdemarslan@gmail.com | Cigdem    | Arslan   | cigdem123  | Apple         | Ricarda Huch weg23 |
      | huseyin@gmail.com      | huseyin   | ozdemir  | huseyin123 | Amazon        | Ricarda Huch weg25 |