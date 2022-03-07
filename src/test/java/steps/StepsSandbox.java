package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GridTestPage;
import pages.ListPage;
import pages.TestSandBox;

import java.util.List;

public class StepsSandbox {

    TestSandBox testSandBox = new TestSandBox();
    GridTestPage gridTestPage = new GridTestPage();
    ListPage listPage = new ListPage();

    // Dropdown
    @Given("^Navegando en sandbox page$")
    public void SandboxNavigate(){
        testSandBox.navigateToSandbox();
    }

    @And("^Seleccionando un valor de un dropdown$")
    public void DropDownSelect(){
        testSandBox.selectCategory("ESP");
    }

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

    //List
    @Given("^I navigate to the list page$")
    public void navigatingLisPage(){
        listPage.navigateToWeb();
    }

    @When("^I search the list$")
    public void searchingList() throws InterruptedException {
        listPage.enterSearchCriteriaList();
    }

    @Then("^I can find the text in the list$")
    public void findingList(){
        List<String> list = listPage.getAllSearchResults();
        boolean textIsHere = list.contains("Orlando, Florida");

        if(textIsHere){
            System.out.println("Text found, congrats!");
        }else{
            throw new Error("The text wasn't there :(");
        }
    }
}
