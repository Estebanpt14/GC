package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class AmazonPage extends BasePage{

    private String Amazon = "https://www.amazon.com/-/es/";
    private String searchField = "//input[@name='field-keywords']";
    private String secondPage = "//a[normalize-space()='2']";
    private String item = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]";
    private String add = "//a[normalize-space()='Agregar a la Lista']";
    private String searchButton = "//input[@value='Ir']";

    public AmazonPage(){
        super(driver);
    }

    public void navigateToAmazon(){
        nagivateTo(Amazon);
    }

    public void searchCriteria(String criteria){
        write(searchField, criteria);
    }

    public void clickSearchButton(){
        ClickElement(searchButton);
    }

    public void switchToSecondPage(){
        ClickElement(secondPage);
    }

    public void selectTheProduct(){
        ClickElement(item);
    }

    public boolean verifyCar(){
        return elementIsDisplayed(add);
    }
}
