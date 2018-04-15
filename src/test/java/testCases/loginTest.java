package testCases;

import browserConfig.browserSelect;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.homepageLogin;
import java.io.IOException;
import org.apache.logging.log4j.*;
import pageObjects.searchPage;

public class loginTest extends browserSelect {

    private static Logger log = LogManager.getLogger(loginTest.class.getName());

    public WebDriver driver = initializeDriver();

    homepageLogin hpl = new homepageLogin(driver);
    searchPage sp = new searchPage(driver);

    public loginTest() throws IOException {
    }


    @Given("^User is on the main webpage$")
    public void user_is_on_the_main_webpage() throws IOException {

        log.info("Opening the main webpage");

        driver.get("http://amazon.com");

        log.info("Clicking on sign in");
        hpl.signIn.click();

    }

    @When("^User enters valid email and password$")
    public void user_enters_valid_email_and_password() throws IOException {

        log.info("entering email address");
        hpl.emailID.sendKeys("xxx");
        log.info("Clicking on next");
        hpl.proceed.click();
        log.info("Entering the password");
        hpl.password.sendKeys("xxx");
        log.info("Clicking on submit");
        hpl.submit.click();

    }

    @Then("^User is presented with the homepage$")
    public void user_is_presented_with_the_homepage() throws IOException {


        if (driver.getCurrentUrl().equals("https://www.amazon.com/?ref_=nav_signin&")) {
            System.out.println("Homepage displayed successfully.");
        }
        log.info("Login successful");

        driver.close();

    }

}

