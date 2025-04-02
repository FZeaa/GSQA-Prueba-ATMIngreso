package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LatamPage {

    private WebDriver driver;
    private static final Logger LOGGER = LoggerFactory.getLogger(LatamPage.class);
    public LatamPage(WebDriver driver) {
        this.driver = driver;
    }


    private By offersAndDestinationsBtn = By.xpath("//button[@title='Ofertas y destinos']");


    /**
     *
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
     *
     */
    public WebElement getOffersAndDestinationsBtnEle(){
        return findElementBy(offersAndDestinationsBtn);
    }

}
