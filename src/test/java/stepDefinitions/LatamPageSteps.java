package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.testng.Assert;
import pages.LatamPage;
import utils.DateHelper;
import config.DriverConfig;
import utils.AssertUtil;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;

public class LatamPageSteps {

    private WebDriver driver;
    private LatamPage latamPage;
    private DateHelper dateHelper;
    private static final Logger LOGGER = LoggerFactory.getLogger(LatamPageSteps.class);
    public LatamPageSteps(DriverConfig driverConfig, LatamPage latamPage, DateHelper dateHelper) {
        this.driver = driverConfig.getDriver();
        this.latamPage = latamPage;
        this.dateHelper = dateHelper;
    }

    /**
     * Method to access the Latam Airlines website
     */
    @When("I am on Latam Airlines homepage")
    public void iNavigateToTheLatamAirlinesHomePage() {
        LOGGER.debug("Aceces to the Latam Airline Website");
        driver.get("https://www.latamairlines.com");
    }

    /**
     * Method for clicking on specific buttons
     * @param buttonName name of the button
     */
    @And("I click in the {string} button")
    public void clickInTheButton(String buttonName) {
      LOGGER.debug("Clicking in the {} button", buttonName);
     switch (buttonName){
         case "Ofertas y destinos":
             latamPage.getOffersAndDestinationsBtnEle().click();
             break;
         case "Ofertas de vuelos":
             latamPage.getFlightOffersBtnEle().click();
             break;
         case "Buscar Vuelos":
             latamPage.getSearchFlightsBtnEle().click();
             break;
         case "Solo Ida":
             latamPage.getOneWayBtnEle().click();
             break;
         case "Close login incentive":
             latamPage.getCloseLoginIncentiveBtnEle().click();
             break;
         default:
             throw new IllegalArgumentException(String.format("Invalid input:", buttonName));
     }
    }

    /**
     * Method to verify if the page redirected to the offer page
     */
    @Then("I should redirect to the offers Page")
    public void iShouldRedirectToTheOffersPage() {
        LOGGER.debug("Checking if the actual page is the offer page...");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AssertUtil.assertUrlContains(driver.getCurrentUrl(), "/ofertas");
    }

    /**
     * Method to verify if the latam packages is displayed
     */
    @And("The Latam Packages image should be displayed")
    public void theLatamPackagesImageShouldBeDisplayed() {
        LOGGER.debug("Checking if the latam packages imagen is displayed...");
        Assert.assertTrue(latamPage.getLatamPackagesImgEle().isDisplayed());
    }

    /**
     * Method to add a flight in the from text field
     * @param origin city or airport of origin
     */
    @When("I search for a flight from {string}")
    public void iSearchForAFlightFromTo(String origin) {
        LOGGER.debug("Searching for a flight from " + origin );
        latamPage.getOriginLabelEle().sendKeys(origin);
        latamPage.getAirportOptionLabelEle().click();
    }

    /**
     * Method to select the actual date and random date with 30 days of difference
     */
    @And("I select a random date")
    public void iSearchInTheDateFromTo() {
        latamPage.getDepartureTextFieldEle().click();
        LOGGER.debug("Selecting the Actual date...");
        String currentDate = dateHelper.getCurrentDate();
        String currentDateXPath = String.format("//span[@data-testid='date-%s']", currentDate);
        WebElement currentDateElement = driver.findElement(By.xpath(currentDateXPath));
        currentDateElement .click();
        latamPage.getReturnTextFieldEle().click();
        LOGGER.debug("Selecting a random future date...");
        String futureDate = dateHelper.generateFutureDate();
        String futureDateXPath = String.format("//span[@data-testid='date-%s']", futureDate);
        WebElement futureDateElement = driver.findElement(By.xpath(futureDateXPath));
        futureDateElement.click();
    }

    /**
     * Method to verify if the error message in the destination text field is displayed 
     */
    @Then("I should be able to see the error message in the Destination text field")
    public void iShouldBeAbleToSeeTheErrorMessageInTheDestinationTextField() {
        LOGGER.debug("Checking if the destination error message is displayed...");
        Assert.assertTrue(latamPage.getDestinationErrorMessageLabelEle().isDisplayed());
    }

    /**
     * Method to verify if the tab flight is displayed
     */
    @And("The tab flight should be display")
    public void theTabFlightShouldBeDisplay() {
        LOGGER.debug("Checking if the tab flight is displayed...");
        Assert.assertTrue(latamPage.getTabFlightGridEle().isDisplayed());
    }

    /**
     * Method to verify if the return date text field is not displayed
     */
    @Then("I should not see a return date text fiel")
    public void iShouldNotSeeAReturnDateTextFiel() {
        LOGGER.debug("Checking if the retunr date text fiel is not displayed..");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(driver.findElements(latamPage.returnTextField).isEmpty());
    }
}
