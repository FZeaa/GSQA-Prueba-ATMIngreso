package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import pages.LatamPage;

public class LatamPageSteps {
    WebDriver driver = new ChromeDriver();
    private static final Logger LOGGER = LoggerFactory.getLogger(LatamPageSteps.class);

    private LatamPage latamPage;
    public LatamPageSteps(LatamPage latamPage){
        this.latamPage = latamPage;
    }

    /**
     * Method
     */
    @When("I navigate to the homepage")
    public void iNavigateToTheHomePage() {
        driver.manage().window().maximize();
        driver.get("https://www.latamairlines.com");
    }

    /**
     *
     */
    @And ("close the Drive")
    public void tearDown() {
        driver.quit();
    }

    /**
     *
     * @param buttonName
     */
    @And("Click in the {string} button")
    public void clickInTheButton(String buttonName) {
        latamPage.getOffersAndDestinationsBtnEle().click();
    }
}
