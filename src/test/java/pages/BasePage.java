package pages;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions actions;

    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
        System.setProperty("webdriver.chrome.driver", "C:\\GProyects\\ChromeDrive\\chromedriver.exe");
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void nagivateTo(String url){
        driver.get(url);
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void ClickElement(String locator){
        Find(locator).click();
    }

    public void write(String locator, String message){
        Find(locator).clear();
        Find(locator).sendKeys(message);
    }

    public void selectFromDropDownByValue(String locator, String valueToSelect){
        Select dropDown = new Select(Find(locator));
        dropDown.selectByValue(valueToSelect);
    }

    public void selectFromDropDownByIndex(String locator, Integer indexToSelect){
        Select dropDown = new Select(Find(locator));
        dropDown.selectByIndex(indexToSelect);
    }

    public void selectFromDropDownByText(String locator, String text){
        Select dropDown = new Select(Find(locator));
        dropDown.selectByVisibleText(text);
    }

    public void hoverOverElement(String locator){
        actions.moveToElement(Find(locator));
    }

    public void doubleClickElement(String locator){
        actions.doubleClick(Find(locator));
    }

    public void rigthClickElement(String locator){
        actions.contextClick(Find(locator));
    }

    public String getValueFromTable(String locator, int row, int column){
        String cellNeeded = locator+"/tbody/tr["+row+"]/td["+column+"]";
        return Find(cellNeeded).getText();
    }

    public void setValueTable(String locator, int row, int column, String message){
        String cellSet = locator+"/table/tbody/tr["+row+"]/td["+column+"]";
        Find(cellSet).sendKeys(message);
    }

    public void sendKeysToWeb(String locator, String keys){
        Find(locator).sendKeys(keys);
    }
    public void switchToIFrame(int iFrameID ){
        driver.switchTo().frame(iFrameID);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void goToLinkByText(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public void dismissAlert(){
        try {
            driver.switchTo().alert().dismiss();
        }catch (NoAlertPresentException e){
            e.printStackTrace();
        }
    }

    /*public void validateText(String locator, String textToValidate){
        Assert.assertEquals(textToValidate, Find(locator).getText());
    }*/

    public String textElement(String locator){
        return Find(locator).getText();
    }

    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }

    public List<WebElement> bringMeAllElements(String locator){
        return driver.findElements(By.className(locator));
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public void selectListElement(String locator, int index){
        List<WebElement> results = driver.findElements(By.xpath(locator));
        results.get(index).click();
    }
}
