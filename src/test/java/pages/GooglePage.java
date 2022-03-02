package pages;

public class GooglePage extends BasePage{

    private String SearchButton = "//div[contains(@jsname,'VlcLAe')]//input[contains(@name,'btnK')]";
    private String SearchField = "//input[@title='Buscar']";

    public GooglePage(){
        super(driver);
    }

    public void navigateToGoogle(){
        nagivateTo("https://www.google.com");
    }

    public void ClickGoogleSearch(){
        ClickElement(SearchButton);
    }

    public void writeGoogleSearch(String message){
        write(SearchField, message);
    }
}
