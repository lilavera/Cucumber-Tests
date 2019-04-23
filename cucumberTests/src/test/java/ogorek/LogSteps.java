package ogorek;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LogSteps {

    private Logowanie logowanie;
    private String username;
    private String password;
    @Given("^Uzytkownik jest na stronie logowania$")
    public void uzytkownikJestNaStronieLogowania() {

    }




    @And("^Informacja zostanie wyswietlona$")
    public void informacjaZostanieWyswietlona() {
        Assert.assertTrue(logowanie.getMsg().equals("Udalo sie zalogowac"));
    }
}


