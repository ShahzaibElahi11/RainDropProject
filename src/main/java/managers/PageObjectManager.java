package managers;

import PageObjects.AboutPage;
import PageObjects.HomePage;
import PageObjects.PlanPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private AboutPage aboutPage;
    private PlanPage planPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public AboutPage getAboutPage() {
        return (aboutPage == null) ? aboutPage = new AboutPage(driver) : aboutPage;
    }

    public PlanPage getPlanPage() {
        return (planPage == null) ? planPage = new PlanPage(driver) : planPage;
    }


}
