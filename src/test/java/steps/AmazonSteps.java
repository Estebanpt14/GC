package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonPage;

public class AmazonSteps {

    AmazonPage amazonPage = new AmazonPage();

    @Given("^The user navigates in Amazon$")
    public void AmazonNavigate(){
        amazonPage.navigateToAmazon();
    }

    @And("^Search for (.+)$")
    public void searchCriteria(String product){
        amazonPage.searchCriteria(product);
        amazonPage.clickSearchButton();
    }

    @And("^navigates to the second page$")
    public void secondPage(){
        amazonPage.switchToSecondPage();
    }

    @And("^select the third item$")
    public void selectThirdItem(){
        amazonPage.selectTheProduct();
    }

    @Then("^the user is able to add the product to the car$")
    public void addTheProduct(){
        Assert.assertTrue(amazonPage.verifyCar());
    }
}
