Feature: Wyplata pieniedzy
  Scenario: Proba wyplacenia hajsu
    Given Konto z saldem 200zl
    When Uzytkownik wyplaca
    Then Wyswietla sie informacja o niewsytarczonej ilosci

