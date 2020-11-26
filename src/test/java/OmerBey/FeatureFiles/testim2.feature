@RegressionTest
Feature: Favorilere Ekleme

  Scenario: Ürünü favorilere ekleme testi
    Given Websiteye git
    And Tisorte tiklat
    And list gorunumune tikla
    And Favorilere ekle butonuna bas
    Then cikan mesaji verify et




