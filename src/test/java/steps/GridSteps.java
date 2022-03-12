package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GridTestPage;

public class GridSteps {

    GridTestPage gridTestPage = new GridTestPage();

    //Table
    @Given("^Testeando una pagina web$")
    public void testWeb(){
        gridTestPage.navigateToGridWeb();
    }

    @Then("^Verifico la existencia de una tabla$")
    public void tableVerification(){
        Assert.assertTrue(gridTestPage.cellStatus());
    }

    //Grid
    @Given("^Navegando en la grilla statica$")
    public void GridNavigate(){
        gridTestPage.navigateToGridWeb();
    }

    @Then("^Puedo tomar el valor que quiera$")
    public void TakeTheValue(){
        Assert.assertEquals("", gridTestPage.takeGridText(1,1));
        //System.out.println(gridTestPage.takeGridText(1,1));
    }
}
