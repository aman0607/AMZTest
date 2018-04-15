package testCases;

import browserConfig.browserSelect;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pageObjects.homepageLogin;
import pageObjects.searchPage;

import java.io.IOException;

public class searchTest extends browserSelect {

    private static Logger log = LogManager.getLogger(loginTest.class.getName());

    public WebDriver driver = initializeDriver();

    homepageLogin hpl = new homepageLogin(driver);
    searchPage sp = new searchPage(driver);

    public searchTest() throws IOException {
    }



    @Given("^User is on the homepage$")
    public void user_is_on_the_homepage() {

        log.info("Opening the main webpage");

        driver.get("http://amazon.com");

        log.info("Clicking on sign in");
        hpl.signIn.click();

        log.info("entering email address");
        hpl.emailID.sendKeys("ropar0607@gmail.com");
        log.info("Clicking on next");
        hpl.proceed.click();
        log.info("Entering the password");
        hpl.password.sendKeys("bhindrawala1");
        log.info("Clicking on submit");
        hpl.submit.click();

        log.info("Search page opened");
        if(driver.getCurrentUrl().equals("https://www.amazon.com/ref=nav_logo")){
            System.out.println("Search page opened successfully");
        }


    }

    @When("^User search for the product$")
    public void user_search_for_the_product() {

        log.info("User search for product");
        sp.searchBar.click();
        sp.searchBar.sendKeys("ssd");

        log.info("User clicks on search button");
        sp.searchButton.click();


    }

    @When("^Selects the product$")
    public void selects_the_product() {

        log.info("User selects the product");
        sp.searchedProduct.click();


    }

    @Then("^Adds the product to the cart$")
    public void adds_the_product_to_the_cart() {

        log.info("User adds the product to cart");
        sp.addToCart.click();

        driver.close();


    }


}




