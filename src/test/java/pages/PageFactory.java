package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PageFactory extends BasePage{

    @CacheLookup //Sirve para guardar el objeto que esta encontrando por findby en el cache para que la proxima vez que se ejecute no tenga que enviar nuevamente el REST a la API
    @FindBy(id = "button")
    WebElement button;

    public PageFactory(){
        super(driver);
        driver.get("www.google.com");
    }
}
