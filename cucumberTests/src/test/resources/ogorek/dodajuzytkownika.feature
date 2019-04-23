Feature:Dodawanie uzytkownika

  Scenario Outline: Dodawanie uzytkownika z poprawnymi danymi

    Given uzytkownik jest na stronie formularzu dodawania nowego uzytkownika


    When Wprowadza poprawne dane do formularza:
      |imie|  nazwisko|  miasto|  ulica|
      |<imie>|<nazwisko>|<miasto>|<ulica>|


    Then Informacja o dodaniu uzytkownika pojawia sie na ekranie
  Examples:

      |imie|nazwisko|miasto|ulica|
      |Tomasz|Kot   |Warszawa|Warszawska|