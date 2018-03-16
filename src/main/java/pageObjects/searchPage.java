package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage {

    public WebDriver driver;

    public searchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBar;

    @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[3]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")
    public WebElement searchedProduct;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCart;




}
