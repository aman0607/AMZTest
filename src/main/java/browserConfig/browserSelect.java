package browserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class browserSelect {

    public static WebDriver driver;

    public WebDriver initializeDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Aman\\IdeaProjects\\AMZTest\\src\\main\\java\\browserConfig\\broswerType.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aman\\Documents\\Selenium\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {

            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aman\\Documents\\Selenium\\Drivers\\geckodriver");
            driver = new FirefoxDriver();


        } else if (browserName.equals("InternetExplorer")) {

            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aman\\Documents\\Selenium\\Drivers\\IEDriverServe");
            driver = new InternetExplorerDriver();

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        return driver;

    }


}
