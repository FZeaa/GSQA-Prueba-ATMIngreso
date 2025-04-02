package utils;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertUtil {
    /**
     * Asserts that an element contains expected text
     * @param element The WebElement to check
     * @param expectedText The text expected to be contained
     * @param elementName Name of the element for reporting
     */
    public static void assertElementContainsText(WebElement element, String expectedText, String elementName) {
        String actualText = element.getText();
        Assert.assertTrue(actualText.contains(expectedText),
                elementName + " should contain text [" + expectedText + "] but contained [" + actualText + "]");
    }

    /**
     * Asserts that an element has exact text
     * @param element The WebElement to check
     * @param expectedText The exact text expected
     * @param elementName Name of the element for reporting
     */
    public static void assertElementHasText(WebElement element, String expectedText, String elementName) {
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText,
                elementName + " text should be [" + expectedText + "] but was [" + actualText + "]");
    }

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