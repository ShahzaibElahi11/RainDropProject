package StepsDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.BrowserFactory;
import managers.PageObjectManager;
import org.testng.Assert;
import utilities.BaseTest;

public class AboutPageSteps extends BaseTest {
    BrowserFactory browserFactory = new BrowserFactory();
    PageObjectManager pageObjectManager = new PageObjectManager(browserFactory.getDriver());


    @When("^user click on about page$")
    public void user_click_on_about_page(){
        pageObjectManager.getAboutPage().clickOnAboutTab();
    }

    @Then("^user is landing successfully and about page is displayed$")
    public void user_is_landing_successfully_and_about_page_is_displayed(){
        Assert.assertTrue(pageObjectManager.getAboutPage().isAboutPageDisplayed(), "Either Page Title or Page URL is wrong");
    }

}
