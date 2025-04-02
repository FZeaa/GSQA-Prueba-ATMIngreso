package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LatamPage {

    private WebDriver driver;

    private By homeTitle = By.id("homeTitle");

    public LatamPage(WebDriver driver) {
        this.driver = driver;
    }

}
