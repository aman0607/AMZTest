package cucumberConfig;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

            monochrome = true,
            features = "C:\\Users\\Aman\\IdeaProjects\\AMZTest\\src\\main\\java\\cucumberConfig\\AmazonApplication.feature"
            ,glue     = {"stepdefinition"}
            ,tags = {"@RegressionTest"}

            )

    public class TestRunner {

    }

