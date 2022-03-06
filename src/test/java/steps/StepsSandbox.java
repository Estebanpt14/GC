package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GridTestPage;
import pages.TestSandBox;

public class StepsSandbox {

    TestSandBox testSandBox = new TestSandBox();
    GridTestPage gridTestPage = new GridTestPage();

    @Given("^Navegando en sandbox page$")
    public void SandboxNavigate(){
        testSandBox.navigateToSandbox();
    }

    @And("^Seleccionando un valor de un dropdown$")
    public void DropDownSelect(){
        testSandBox.selectCategory("ESP");
    }

    @Given("^Testeando una pagina web$")
    public void testWeb(){
        gridTestPage.navigateToGridWeb();
    }

    @Then("^Verifico la existencia de una tabla$")
    public void tableVerification(){
        Assert.assertTrue(gridTestPage.cellStatus());
    }

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
