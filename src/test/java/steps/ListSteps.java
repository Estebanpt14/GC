package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

import java.util.List;

public class ListSteps {

    ListPage listPage = new ListPage();

    @Given("^I navigate to the list page$")
    public void navigatingLisPage(){
        listPage.navigateToWeb();
    }

    @When("^I search (.+) in the list$")
    public void searchingList(String state) throws InterruptedException {
        listPage.enterSearchCriteriaList(state);
    }

    @Then("^I can find the (.+) in the list$")
    public void findingList(String city){
        List<String> list = listPage.getAllSearchResults();
        boolean textIsHere = list.contains(city);

        if(textIsHere){
            System.out.println("Text found, congrats!");
        }else{
            throw new Error("The text wasn't there :(");
        }
    }
}
