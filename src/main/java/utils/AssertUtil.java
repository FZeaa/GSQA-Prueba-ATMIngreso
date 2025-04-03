package utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertUtil {

    /**
     * Asserts that current URL contains expected text
     * @param currentUrl The current URL
     * @param expectedUrlPart Text expected to be in the URL
     */
    public static void assertUrlContains(String currentUrl, String expectedUrlPart) {
        Assert.assertTrue(currentUrl.contains(expectedUrlPart),
                "URL should contain [" + expectedUrlPart + "] but was [" + currentUrl + "]");
    }
}