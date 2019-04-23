package ogorek;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class NowyUzytkownikSteps {


    @Given("^uzytkownik jest na stronie formularzu dodawania nowego uzytkownika$")
    public void uzytkownikJestNaStronieFormularzuDodawaniaNowegoUzytkownika() {
        System.out.println("Information is shown");
    }



    @When("^Wprowadza poprawne dane do formularza:$")
    public void wprowadzaPoprawneDaneDoFormularza(DataTable dataTable) {

        Map<String,String> data = dataTable.asMaps(String.class,String.class).get(0);
        System.out.println("Imie" + data.get("imie"));
        System.out.println("Nazwisko" + data.get("nazwisko"));
        System.out.println("Miasto" + data.get("miasto"));
        System.out.println("Ulica" + data.get("ulica"));

    }

    @Then("^Informacja o dodaniu uzytkownika pojawia sie na ekranie$")
    public void informacjaODodaniuUzytkownikaPojawiaSieNaEkranie() {

        System.out.println("New user is added");
    }


}
