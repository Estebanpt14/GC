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
}
