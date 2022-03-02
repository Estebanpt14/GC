package pages;

public class TestSandBox extends BasePage{

    private static String DropDownSandbox = "//div[@rel-title='Select Country']//p//select";

    public TestSandBox() {
        super(driver);
    }

    public void navigateToSandbox(){
        nagivateTo("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
    }

    public void selectCategory(String category){
        selectFromDropDownByValue(DropDownSandbox, category);
    }
}
