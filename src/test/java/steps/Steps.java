package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class Steps {

    GooglePage google;

    @Given("^Navego por Google$")
    public void NavigateForGoogle(){
        google = new GooglePage();
        google.navigateToGoogle();
    }

    @When("^Busco algo$")
    public void SearchInGoogle(){

    }

    @Then("^Obtengo resultados$")
    public void ObtainGoogle(){

    }
}
