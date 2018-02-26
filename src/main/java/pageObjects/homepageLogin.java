package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageLogin {

    public WebDriver driver;

    public homepageLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    public WebElement signIn;

    @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[4]/div[3]/div[2]/div/div[1]/div/a/span")
    public WebElement hoverSignIn;

    @FindBy(xpath = "//*[@id='continue']")
    public WebElement proceed;

    @FindBy(xpath = "//*[@id='ap_email']")
    public WebElement emailID;

    @FindBy(xpath ="//*[@id='ap_password']" )
    public WebElement password;

    @FindBy(xpath ="//*[@id='signInSubmit']" )
    public WebElement submit;


}
