package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HomePage {
    private WebDriver driver;
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    private By fromParis = By.xpath("//option[@value='Paris']");
    private By toLondon = By.xpath("//option[@value='London']");
    private By findFlightsBtn = By.cssSelector("input[type='submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseDestinations() {
        logger.info("Selecting destinations: Paris to London");
        driver.findElement(fromParis).click();
        driver.findElement(toLondon).click();
    }

    public void clickFindFlights() {
        logger.info("Clicking Find Flights button");
        driver.findElement(findFlightsBtn).click();
    }
}