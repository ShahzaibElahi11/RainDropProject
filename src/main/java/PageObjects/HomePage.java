package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseTest;
import utilities.DefaultConfiguration;

public class HomePage extends BaseTest {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Home']")
    private WebElement homepage;
    @FindBy(xpath = "//div[contains(text(),'Health Insurance')]")
    private WebElement homePageHeading;

    public void launchEnvironment() {
        driver.get(DefaultConfiguration.getProperty("Environment"));
        driver.manage().window().maximize();
    }

    public void clickOnHomeTab() {
        clickElement(homepage, "User Click on Home Page on Header");
    }

    public boolean isHomePageDisplayed() {
        return isElementDisplayed(homePageHeading, "Home Page heading")
                && driver.getCurrentUrl().contains("home");
    }
}
