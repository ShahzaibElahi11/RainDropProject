package StepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Hook {
    BrowserFactory browserFactory = new BrowserFactory();
    WebDriver driver;

    @Before
    public void beforeScenario(Scenario scenario) {
        driver = browserFactory.createDriver();
    }

    @After
    public void afterScenario(Scenario scenario) {
        browserFactory.closeDriver();
    }
}
