package pages;

import org.openqa.selenium.WebDriver;

public class GridTestPage extends BasePage{

    private static String locator = "https://developer.mozilla.org/en-US/docs/Learn/HTML/Tables/Basics";
    private static String table = "//article[@lang='en-US']//div//table";

    public GridTestPage() {
        super(driver);
    }

    public void navigateToGridWeb(){
        nagivateTo(locator);
    }

    public String takeGridText(int rows, int columns){
        return getValueFromTable(table, rows, columns);
    }
}
