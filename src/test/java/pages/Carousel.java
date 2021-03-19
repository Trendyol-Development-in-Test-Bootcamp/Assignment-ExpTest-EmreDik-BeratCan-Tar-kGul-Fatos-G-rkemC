package pages;

import Constants.Const;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Carousel extends Const {

    WebDriver driver;
    Point point;
    Actions action;
    String url;
    WebElement element;

    public Carousel(WebDriver driver){
        this.driver = driver;
        action = new Actions(driver);
    }

    public void goTrendyol(String temp) {
        element = driver.findElement(By.xpath(product));
        point = element.getLocation();

        action.moveByOffset(point.getX(),point.getY()).click().perform();
        url = driver.getTitle();
        Assert.assertTrue(url.contains(temp));
    }
}
