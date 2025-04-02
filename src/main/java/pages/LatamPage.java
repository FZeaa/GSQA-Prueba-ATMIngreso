package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import config.DriverConfig;


public class LatamPage {

    private WebDriver driver;
    private static final Logger LOGGER = LoggerFactory.getLogger(LatamPage.class);

    public LatamPage(DriverConfig driverConfig) {
        this.driver = driverConfig.getDriver();
    }


    private By offersAndDestinationsBtn = By.xpath("//button[@title='Ofertas y destinos']");
    private By FlightOffersBtn = By.xpath("//span[@data-testid='header__navbar__lnk-flight-offers--menuitem__label-content'][contains(.,'Ofertas de vuelos')]");
    private By latamPackagesImg = By.xpath("//img[@src='/content/dam/latamxp/sites/travel/mvp-subhome/banners-promocionales/co/campañas/2025/san-valentin/Subhome LT Banner Oferta 864x500 D! Desde (2).png']");
    private By originTextField = By.xpath("//input[@data-testid='fsb-origin--text-field']");
    private By departureTextField = By.xpath("//div[@data-testid='fsb-departure--text-field__wrapper']");
    public  By returnTextField = By.xpath("//div[@data-testid='fsb-return--text-field__wrapper']");
    private By searchFlightsBtn = By.xpath("//button[@data-testid='fsb-search-flights--button']");
    private By airportOptionLabel = By.xpath("//span[contains(@data-testid,'airport--autocomplete')]");
    private By destinationErrorMessageLabel = By.xpath("//div[@data-testid='fsb-destination--text-field__helper-text']");
    private By oneWayButton = By.xpath("//div[@data-testid='fsb-one-way']");
    private By tabFlightGrid = By.xpath("//div[@class='InputsGrid-sc-akbnfi-0 ktdkvt']");
    private By closeLoginIncentiveBtn = By.xpath("//button[@data-testid='button-close-login-incentive']");

    /**
     * @return element for offers and destination button
     */
    public WebElement getOffersAndDestinationsBtnEle(){
        return driver.findElement(offersAndDestinationsBtn);
    }

    /**
     * @return element for flight offers button
     */
    public  WebElement getFlightOffersBtnEle(){
        return driver.findElement(FlightOffersBtn);
    }

    /**
     * @return element for latam packages imagen
     */
    public WebElement getLatamPackagesImgEle(){
        return driver.findElement(latamPackagesImg);
    }

    /**
     * @return element for origin text field
     */
    public  WebElement getOriginLabelEle(){
        return driver.findElement(originTextField);
    }

    /**
     * @return element for Departure text field
     */
    public WebElement getDepartureTextFieldEle(){
        return driver.findElement(departureTextField);
    }

    /**
     * @return element for Return text field
     */
    public WebElement getReturnTextFieldEle(){
        return driver.findElement(returnTextField);
    }

    /**
     * @return element for search flights button
     */
    public WebElement getSearchFlightsBtnEle(){
        return driver.findElement(searchFlightsBtn);
    }

    /**
     * @return element for airport Options Label
     */
    public WebElement getAirportOptionLabelEle(){
        return driver.findElement(airportOptionLabel);
    }

    /**
     * @return element for destination error message label
     */
    public WebElement getDestinationErrorMessageLabelEle(){
        return driver.findElement(destinationErrorMessageLabel);
    }

    /**
     * @return element for one way button
     */
    public WebElement getOneWayBtnEle(){
        return driver.findElement(oneWayButton);
    }

    /**
     * @return element for tab flight grid
     */
    public WebElement getTabFlightGridEle(){
        return driver.findElement(tabFlightGrid);
    }

    /**
     * @return element for close login incentive button 
     */
    public WebElement getCloseLoginIncentiveBtnEle(){
        return driver.findElement(closeLoginIncentiveBtn);
    }
}
