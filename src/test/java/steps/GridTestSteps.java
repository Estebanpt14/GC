package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GridTestPage;

public class GridTestSteps {

    GridTestPage gridTestPage = new GridTestPage();

    @Given("^Navegando en la grilla statica$")
    public void GridNavigate(){
        gridTestPage.navigateToGridWeb();
    }

    @Then("^Puedo tommar el valor que quiera$")
    public void TakeTheValue(){
        //System.out.println(gridTestPage.takeGridText(1,1));
    }
}
