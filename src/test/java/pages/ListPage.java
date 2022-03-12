package pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends BasePage{

    private String searchListField = "//input[@placeholder='City or State']";
    private String searchResult = "name";

    public ListPage(){
        super(driver);
    }

    public void navigateToWeb(){
        nagivateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html");
    }

    public void enterSearchCriteriaList(String state) throws InterruptedException {
        try {
            Thread.sleep(600);
            write(searchListField, state);
        }catch (NoSuchElementException e){
            System.out.println("The field wasn't found");
            e.printStackTrace();
        }
    }

    public List<String> getAllSearchResults(){
        List<WebElement> auxList = bringMeAllElements(searchResult);
        List<String> listResult = new ArrayList<>();
        for(WebElement e: auxList){
            listResult.add(e.getText());
        }
        return listResult;
    }
}
