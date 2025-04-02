package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LatamPage;

public class LatamPageSteps {
    WebDriver driver = new ChromeDriver();
    @When("I navigate to the homepage")
    public void iNavigateToTheHomePage() {
        driver.manage().window().maximize();
        driver.get("https://www.latamairlines.com");
    }

    @And ("close the Drive")
    public void tearDown() {
        driver.quit();
    }
}
