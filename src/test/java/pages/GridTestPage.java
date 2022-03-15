package pages;


public class GridTestPage extends BasePage{

    private static String locator = "https://www.globalsqa.com/angularJs-protractor/WebTable/";
    private static String table = "//table[@st-table='rowCollection']";
    private static String firstTextToValidate = "";

    public GridTestPage() {
        super(driver);
    }

    public void navigateToGridWeb(){
        nagivateTo(locator);
    }

    public String takeGridText(int rows, int columns){
        return getValueFromTable(table, rows, columns);
    }

    public boolean cellStatus(){
        return elementIsDisplayed(table);
    }
}
