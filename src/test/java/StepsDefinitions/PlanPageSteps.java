package StepsDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.BrowserFactory;
import managers.PageObjectManager;
import org.testng.Assert;
import utilities.BaseTest;

public class PlanPageSteps extends BaseTest {
    BrowserFactory browserFactory = new BrowserFactory();
    PageObjectManager pageObjectManager = new PageObjectManager(browserFactory.getDriver());

    @When("^user click on plan page$")
    public void user_click_on_plan_page() {
        pageObjectManager.getPlanPage().clickOnPlanTab();
    }

    @Then("^user answer the following question with yes$")
    public void user_answer_the_following_question_with_yes() throws Throwable {
        pageObjectManager.getPlanPage().clickOnAgeButton();
        pageObjectManager.getPlanPage().clickOnDiseasesButton();
        pageObjectManager.getPlanPage().clickOnPhysicalActivityButton();
        pageObjectManager.getPlanPage().clickOnSmokeButton();
        pageObjectManager.getPlanPage().clickOnConsumeAlcohol();
        pageObjectManager.getPlanPage().clickOnGetPlanButton();
        Thread.sleep(5000);
    }

    @Then("^user is landing successfully and plan page is displayed$")
    public void user_is_landing_successfully_and_plan_page_is_displayed() {
        Assert.assertTrue(pageObjectManager.getPlanPage().isPlanPageDisplayed(), "Either Page Title or Page URL is wrong");
    }

    @Then("^user buy now care life plan$")
    public void user_buy_now_care_life_plan() {
        pageObjectManager.getPlanPage().selectOnCareLifePlan();
    }

    @Then("^user insert payment details$")
    public void user_insert_payment_details() throws Throwable {
        pageObjectManager.getPlanPage().enterDetailForPlan();
    }

    @Then("^user click on submit button$")
    public void user_click_on_submit_button() throws Throwable {
        pageObjectManager.getPlanPage().clickOnSubmitButton();
    }

    @Then("^user can verify the submission$")
    public void user_can_verify_the_submission() {
        Assert.assertTrue(pageObjectManager.getPlanPage().isCongratulationsMessageDisplayed(), "Either Page Title is wrong");
    }

    @Then("^user answer the following question with no$")
    public void user_answer_the_following_question_with_no() {
        pageObjectManager.getPlanPage().clickOnAbove30AgeButton();
        pageObjectManager.getPlanPage().clickOnDenyExistingDiseasesButton();
        pageObjectManager.getPlanPage().clickOnDenyPhysicalActivityButton();
        pageObjectManager.getPlanPage().clickOnDenySmokeButton();
        pageObjectManager.getPlanPage().clickOnDenyConsumeAlcohol();
        pageObjectManager.getPlanPage().clickOnGetPlanButton();
    }

    @Then("^user buy now good health plan$")
    public void user_buy_now_good_health_plan() {
        pageObjectManager.getPlanPage().selectOnGoodHealthPlan();
    }
}
