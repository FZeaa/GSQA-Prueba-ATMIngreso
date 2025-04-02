package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfig {
    private WebDriver driver;

    public DriverConfig() {
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}