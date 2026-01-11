package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {
    private WebDriver driver;
    private By nameInput = By.id("inputName");
    private By purchaseBtn = By.xpath("//input[@value='Purchase Flight']");

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void clickPurchaseFlight() {
        driver.findElement(purchaseBtn).click();
    }
}