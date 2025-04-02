package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

    /**
     * Method to find an element using the driver using the input by
     * @param by
     * @return element for specific
     */
    private WebElement findElementBy(By by){
        LOGGER.info("[FindElementBy]By to find: {}", by);
        try {
            return driver.findElement(by);
        } catch (NoSuchElementException nse){
            LOGGER.debug("By: {} is not displayed/available. Returning Null", by);
            return null;
        }
    }

    /**
     * @return element for offers and destination button
     */
    public WebElement getOffersAndDestinationsBtnEle(){
        return findElementBy(offersAndDestinationsBtn);
    }

    /**
     * @return element for flight offers button
     */
    public  WebElement getFlightOffersBtnEle(){
        return findElementBy(FlightOffersBtn);
    }

    /**
     * @return element for latam packages imagen
     */
    public WebElement getLatamPackagesImgEle(){
        return findElementBy(latamPackagesImg);
    }
}
