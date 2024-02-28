import Pages.AndroidHomePage;
import Pages.ChromeBrowserPage;
import Pages.FlyPgsMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FlyPgsTestSteps {
    @Given("User opens phone")
    public void userOpensPhone() {
        System.out.println("This process will be made by the before hook in util");
    }

    @When("Opens google chrome browser")
    public void opensGoogleChromeBrowser() {
        AndroidHomePage.userClicksToChromeIcon();
    }

    @When("User writes flypgs web adress to google search bar")
    public void userWritesFlypgsWebAdressToGoogleSearchBar() {
        ChromeBrowserPage.userWritesExactURL();
    }

    @When("User accepts site cookies")
    public void userAcceptsSiteCookies() {
        FlyPgsMainPage.acceptCookies();
    }

    @When("User selects departure airport")
    public void userSelectsDepartureAirport() {
        FlyPgsMainPage.selectingDepartureAirport();
    }

    @When("User selects arrival airport")
    public void userSelectsArrivalAirport() {
        FlyPgsMainPage.selectingArrivalAirport();
    }

    @When("User clicks to search button")
    public void userClicksToSearchButton() {
        FlyPgsMainPage.userClicksToSearchFlightButton();
    }

    @When("User clicks to filter")
    public void userClicksToFilter() {
        FlyPgsMainPage.clickingFilterIcon();
    }

    @When("User filters flights for their price")
    public void userFiltersFlightsForTheirPrice() {
        FlyPgsMainPage.selectingPriceOptionInFilter();
        FlyPgsMainPage.selectingFirstFlight();
    }
}
