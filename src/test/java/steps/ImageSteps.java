package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImagenPage;

public class ImageSteps {

    ImagenPage imagenPage = new ImagenPage();

    @Given("^Navegando por una pagina web$")
    public void navigating(){
        imagenPage.navigatingInAWeb();
    }

    @And("^Dar click en subir imagen$")
    public void uploadImage() throws InterruptedException {
        imagenPage.subirImagen();
    }

   // @When("^Subo la imagen$")

    //@Then("^la imagen se sube a la pagina web$")
}
