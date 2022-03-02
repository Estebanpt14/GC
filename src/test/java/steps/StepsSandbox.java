package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestSandBox;

public class StepsSandbox {

    TestSandBox testSandBox = new TestSandBox();

    @Given("^Navegando en sandbox page$")
    public void SandboxNavigate(){
        testSandBox.navigateToSandbox();
    }

    @And("^Seleccionando un valor de un dropdown$")
    public void DropDownSelect(){
        testSandBox.selectCategory("ESP");
    }
}
