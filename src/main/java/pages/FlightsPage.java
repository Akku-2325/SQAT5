package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {
    private WebDriver driver;
    private By firstFlightBtn = By.cssSelector("tr:nth-child(1) input[type='submit']");

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstFlight() {
        driver.findElement(firstFlightBtn).click();
    }
}