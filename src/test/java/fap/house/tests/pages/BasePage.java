package fap.house.tests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import fap.house.tests.helpers.Report;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static io.qameta.allure.Allure.step;

/**
 * BasePage --- any page grandma. It has methods everyone needs
 */
public interface BasePage {

    String UPLOADS_FOLDER = "src/test/resources/uploads/";

    default void submit() {
        String url = url();
        // Back button is of a 'submit' type. I lol'd. But it's not ok.
        SelenideElement b = $(By.xpath(
                "//button[@type='submit'][not(descendant::*[text() = 'Back'])]"));
        int i = 0;
        clickOn(b);
        while (url.equals(url()) && (i++<10)) {
            sleep(100);
        }
    }

    /**
     * Use this method instead of .click()
     * It makes a screenshot.
     */
    default void clickOn(SelenideElement element) {
        Report.screenshot(element.toString());
        element.click();
    }

    default SelenideElement $id(String testId) {
        return $("[data-testid=" + testId + "]");
    }

    default ElementsCollection $$id(String testId) {
        return $$("[data-testid=" + testId + "]");
    }

    default void dataMessage(String name, Map testDataMap) {
        step(name + "::: " + StringUtils.join(testDataMap));
    }

    default void dataMessage(String name, String testDataString) {
        step(name + "::: " + testDataString);
    }
}
