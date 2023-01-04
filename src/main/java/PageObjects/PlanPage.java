package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseTest;

public class PlanPage extends BaseTest {

    WebDriver driver;

    public PlanPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Plans']")
    public WebElement planPage;
    @FindBy(xpath = "//input[@id='below_30_1']")
    public WebElement below30Age;
    @FindBy(xpath = "//input[@id='diseases_1']")
    public WebElement existingDiseases;
    @FindBy(xpath = "//input[@id='physical_activity_1']")
    public WebElement physicalActivity;
    @FindBy(xpath = "//input[@id='smoke_1']")
    public WebElement smoke;
    @FindBy(xpath = "//input[@id='alcohol_1']")
    public WebElement consumeAlcohol;
    @FindBy(xpath = "//button[normalize-space()='Get Plans']")
    public WebElement getPlanButton;
    @FindBy(xpath = "(//h2[normalize-space()='Select Plan'])[1]")
    public WebElement planPageHeading;
    @FindBy(xpath = "//button[normalize-space()='Care Life Plan']")
    public WebElement careLifePlan;
    @FindBy(xpath = "//div[@id='plan0']//button[@type='button'][normalize-space()='Buy Now']")
    public WebElement careLifePlanBuyNow;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;
    @FindBy(xpath = "//input[@id='age']")
    public WebElement age;
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@id='cardNumber']")
    public WebElement cardNumber;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//select[@id='paymentFreq']")
    public WebElement paymentFrequency;
    @FindBy(xpath = "//input[@id='paymentMode_1']")
    public WebElement paymentMode;
    @FindBy(xpath = "//div[contains(text(),'Congratulations! you have bought a new policy. Bel')]")
    public WebElement congratulationsMessage;
    @FindBy(xpath = "//input[@id='below_30_2']")
    public WebElement above30Age;
    @FindBy(xpath = "//input[@id='diseases_2']")
    public WebElement denyExistingDiseases;
    @FindBy(xpath = "//input[@id='physical_activity_2']")
    public WebElement denyPhysicalActivity;
    @FindBy(xpath = "//input[@id='smoke_2']")
    public WebElement denySmoke;
    @FindBy(xpath = "//input[@id='alcohol_2']")
    public WebElement denyConsumeAlcohol;
    @FindBy(xpath = "//button[normalize-space()='Good Health Plan']")
    public WebElement goodHealthPlan;
    @FindBy(xpath = "//div[@id='plan1']//button[@type='button'][normalize-space()='Buy Now']")
    public WebElement goodHealthPlanBuyNow;

    public void clickOnPlanTab() {
        clickElement(planPage, "User Click on Plan Page on Header");
    }

    public void clickOnAgeButton() {
        clickElement(below30Age, "User Click on Yes button on below 30 years of age?");
    }

    public void clickOnDiseasesButton() {
        clickElement(existingDiseases, "User Click on Yes button on having any existing diseases?");
    }

    public void clickOnPhysicalActivityButton() {
        clickElement(physicalActivity, "User Click on Yes button on involved in some physical activity");
    }

    public void clickOnSmokeButton() {
        clickElement(smoke, "User Click on Yes button on Smoke Activity");
    }

    public void clickOnConsumeAlcohol() {
        clickElement(consumeAlcohol, "User Click on Yes button on Consume Alcohol");
    }

    public void clickOnGetPlanButton() {
        clickElement(getPlanButton, "User Click on Get Plan Button");
    }

    public boolean isPlanPageDisplayed() {
        return isElementDisplayed(planPageHeading, "Plan Page heading")
                && driver.getCurrentUrl().contains("plans");
    }

    public void selectOnCareLifePlan() {
        clickElement(careLifePlan, "User Click on Care Life Plan Tab");
        clickElement(careLifePlanBuyNow, "User Buy Now Care Life Plan");
    }

    public void enterDetailForPlan() throws InterruptedException {
        sendText(name, faker.name().fullName(), "Enter Name");
        sendText(age, faker.number().digits(2), "Enter Age");
        sendText(phone, faker.phoneNumber().cellPhone(), "Enter Phone Number");
        sendText(email, faker.internet().emailAddress(), "Enter Email Address");
        sendText(city, faker.country().capital(), "Enter City");
        sendText(cardNumber, faker.number().digits(12), "Enter Card Details");
        clickElement(paymentMode, "User Select on Credit Card of Payment Mode");
        clickElement(paymentFrequency, "User Select on Payment Frequency from Dropdown");
        Select select = new Select(paymentFrequency);
        select.selectByVisibleText("Yearly");
        Thread.sleep(5000);
    }

    public void clickOnSubmitButton() throws InterruptedException {
        clickElement(submitButton, "User Click on Summit Button");
        Thread.sleep(5000);
    }

    public boolean isCongratulationsMessageDisplayed() {
        return isElementDisplayed(congratulationsMessage, "Congratulations Message");
    }

    public void clickOnAbove30AgeButton() {
        clickElement(above30Age, "User Click on No button on below 30 years of age?");
    }

    public void clickOnDenyExistingDiseasesButton() {
        clickElement(denyExistingDiseases, "User Click on No button on having any existing diseases?");
    }

    public void clickOnDenyPhysicalActivityButton() {
        clickElement(denyPhysicalActivity, "User Click on No button on involved in some physical activity");
    }

    public void clickOnDenySmokeButton() {
        clickElement(denySmoke, "User Click on No button on Smoke Activity");
    }

    public void clickOnDenyConsumeAlcohol() {
        clickElement(denyConsumeAlcohol, "User Click on No button on Consume Alcohol");
    }

    public void selectOnGoodHealthPlan() {
        clickElement(goodHealthPlan, "User Click on Good Health Plan Tab");
        clickElement(goodHealthPlanBuyNow, "User Buy Now Good Health Plan");
    }

}
