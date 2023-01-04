package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseTest;

public class AboutPage extends BaseTest {
    WebDriver driver;

    public AboutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[normalize-space()='About Us']")
    private WebElement aboutPageHeading;
    @FindBy(xpath = "//a[@class='nav-link'][normalize-space()='About']")
    public WebElement aboutPage;

    public void clickOnAboutTab() {
        clickElement(aboutPage, "User Click on About Page on Header");
    }

    public boolean isAboutPageDisplayed() {
        return isElementDisplayed(aboutPageHeading, "About Page Heading")
                && driver.getCurrentUrl().contains("about");
    }
}
