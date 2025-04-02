package stepDefinitions;

import config.DriverConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;

    public Hooks(DriverConfig driverConfig) {
        this.driver = driverConfig.getDriver();
    }

    @Before
    public void setUp() {
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}