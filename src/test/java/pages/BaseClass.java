package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utility.BrowserFactory;
import utility.ConfigDataProvider;

public class BaseClass {

    public WebDriver driver;
    public ConfigDataProvider config;
    ChromeOptions options;

    @BeforeSuite
    public void setupSuite(){
        config = new ConfigDataProvider();
    }

    @BeforeClass
    public void setup(){
        driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getStagingURL());
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
    }

    @AfterClass
    public void tearDown(){
        BrowserFactory.quitBrowser(driver);
    }

}
