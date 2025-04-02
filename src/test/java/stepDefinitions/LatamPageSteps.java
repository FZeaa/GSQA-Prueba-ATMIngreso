package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.testng.Assert;
import pages.LatamPage;
import config.DriverConfig;
import utils.AssertUtil;
import java.util.concurrent.TimeUnit;

public class LatamPageSteps {

    private WebDriver driver;
    private LatamPage latamPage;
    private static final Logger LOGGER = LoggerFactory.getLogger(LatamPageSteps.class);
    public LatamPageSteps(DriverConfig driverConfig, LatamPage latamPage) {
        this.driver = driverConfig.getDriver();
        this.latamPage = latamPage;
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
    @And("I Click in the {string} button")
    public void clickInTheButton(String buttonName) {
      LOGGER.debug("Clicking in the {} button", buttonName);
     switch (buttonName){
         case "Ofertas y destinos":
             latamPage.getOffersAndDestinationsBtnEle().click();
             break;
         case "Ofertas de vuelos":
             latamPage.getFlightOffersBtnEle().click();
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

}
