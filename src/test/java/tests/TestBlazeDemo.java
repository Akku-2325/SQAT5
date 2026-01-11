package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestBlazeDemo extends BaseTest {

    @Test
    public void testPositiveBooking() {
        HomePage home = new HomePage(driver);
        FlightsPage flights = new FlightsPage(driver);
        PurchasePage purchase = new PurchasePage(driver);
        ConfirmationPage confirmation = new ConfirmationPage(driver);

        test.info("Choosing destinations");
        home.chooseDestinations();
        home.clickFindFlights();

        test.info("Selecting first flight");
        flights.selectFirstFlight();

        test.info("Entering user info");
        purchase.enterName("Akku Aldibayeva");
        purchase.clickPurchaseFlight();

        String actualTitle = confirmation.getPageTitle();
        Assert.assertEquals(actualTitle, "BlazeDemo Confirmation");
        test.pass("Booking confirmed!");
    }
}