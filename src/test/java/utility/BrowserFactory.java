package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver startApplication(WebDriver driver, String browserName, String appURL){
        if(browserName.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Documents\\chrdriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\Documents\\geckodriver-v0.28.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else{
            System.out.println("We do not support this browser");
        }

        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(appURL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        return driver;
    }

    public static void quitBrowser(WebDriver driver){
        driver.quit();
    }
}
