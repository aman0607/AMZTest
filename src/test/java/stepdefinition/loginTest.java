package stepdefinition;

import browserConfig.browserSelect;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pageObjects.homepageLogin;
import java.io.IOException;

public class loginTest extends browserSelect{

    public WebDriver driver = initializeDriver();



    homepageLogin hpl = new homepageLogin(driver);

    public loginTest() throws IOException {
    }


    @Given("^User is on the main webpage$")
        public void user_is_on_the_main_webpage() throws IOException {


            driver.get("http://amazon.com");

            Actions action = new Actions(driver);
            action.moveToElement(hpl.signIn).click(hpl.hoverSignIn).build().perform();


        }

        @When("^User enters valid email and password$")
        public void user_enters_valid_email_and_password() throws IOException {

            hpl.emailID.sendKeys("xxx");
            hpl.proceed.click();
            hpl.password.sendKeys("xxx");
            hpl.submit.click();

        }

        @Then("^User is presented with the homepage$")
        public void user_is_presented_with_the_homepage() throws IOException {

            if(driver.getCurrentUrl().equals("https://www.amazon.com/?ref_=nav_signin&")){
                System.out.println("Homepage displayed successfully.");
            }

        }


    }


