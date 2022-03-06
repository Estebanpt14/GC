package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GooglePage;

public class StepsGoogle {

    GooglePage google = new GooglePage();

    @Given("^Navego por Google$")
    public void NavigateForGoogle(){
        google.navigateToGoogle();
    }

    @When("^Escribo el texto$")
    public void SearchInGoogle(){
        google.writeGoogleSearch("Manuela");
    }

    @And("^Presiono enter$")
    public void PressEnter(){
        google.ClickGoogleSearch();
    }

    @Then("^Obtengo resultados$")
    public void ObtainGoogle(){
        Assert.assertEquals("", google.takeText());
    }
}
