package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"StepsDefinitions"},
        //	tags = "@Shahzaib",
        plugin = {"pretty", "html:target/TestReport.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        monochrome = true,
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
//    @BeforeSuite
//    public void beforeSuit() {
//    }
}