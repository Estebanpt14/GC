package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Hook extends BasePage {
    public Hook(){
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            //scenario.write("Faulire!!");
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            //scenario.embed(screenshot, "image/png");
        }
    }
}
