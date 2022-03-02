package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static{
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
        System.setProperty("webdriver.chrome.driver", "C:\\GProyects\\ChromeDrive\\chromedriver.exe");
    }

    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
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
}
