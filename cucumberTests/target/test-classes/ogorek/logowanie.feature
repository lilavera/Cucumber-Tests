
Feature: uzytkownik loguje sie do aplikacji



  Background:  Given Uzytkownik jest na stronie logowania
  Scenario Outline:Uzytkownik podaje poprawne dane

  #given jest warunkiem wstepnym dla przeprowadzenia testu
    Given Uzytkownik jest na stronie logowania
#when akcja ktora zostanie wykonana
    When uzytkownik wprowadza poprawna nazwe uzytkownika "<login>" i "<haslo>"
    #AND opisuje dodatkowa akcje
    And uzytkownik istnieje w bazie danych
  #then opisuje wynik z poprzednuch krokow
    Then Uzytkownik zostanie przekierowany do portalu
    And Informacja zostanie wyswietlona

  Examples:
    |login|login|
    |haslo|haslo2|

    #given jest warunkiem wstepnym dla przeprowadzenia testu
   # Given Uzytkownik jest na stronie logowania
#warunek wsteony
 #   And uzytkownik jest w bazie danych
  #  When uzytkownik wprowadza poprawna nazwe uzytkownika i bledne haslo
  #when akcja ktora zostanie wykonana
  #  And  uzytkownik klika przycisk OK
  #umozliwia dodanie negatywnego komenarza,ktory sluzy do negatywnych warunkow
  #  But Dane logowania sa niepoprawne
  #  Then Uzytkownik nie zostanie przekierowany do portalu
  #  And Informacja zostanie wyswietlona
