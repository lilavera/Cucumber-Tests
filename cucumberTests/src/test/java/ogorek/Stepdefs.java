package ogorek;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

    @Given("Konto z saldem 200zl")
    public void kontoZSaldem() {
        int arg = 300;
        System.out.println("Metoda Given");
    }

    @When("Uzytkownik wyplaca")
    public void wyplataKonta() {
        int arg = 300;
        System.out.println("Metoda When");
    }

    @Then("Wyswietla sie informacja o niewsytarczonej ilosci")
    public void finalkonto() {
        int arg = 300;
        System.out.println("Metoda Then");
    }
}
