package StepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.BrowserFactory;
import managers.PageObjectManager;
import org.testng.Assert;
import utilities.BaseTest;

public class HomePageSteps extends BaseTest {
    BrowserFactory browserFactory = new BrowserFactory();
    PageObjectManager pageObjectManager = new PageObjectManager(browserFactory.getDriver());

    @Given("^launch the environment$")
    public void launch_the_environment() {
        pageObjectManager.getHomePage().launchEnvironment();
    }

    @When("^user click on home page$")
    public void user_click_on_home_page() {
        pageObjectManager.getHomePage().clickOnHomeTab();
    }

    @When("^user is landing successfully and home page is displayed$")
    public void user_is_landing_successfully_and_home_page_is_displayed() {
        Assert.assertTrue(pageObjectManager.getHomePage().isHomePageDisplayed(), "Either Page Title or Page URL is wrong");
    }
}
