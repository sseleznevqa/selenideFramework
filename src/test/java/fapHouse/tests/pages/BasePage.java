package fapHouse.tests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import fapHouse.tests.helpers.Report;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static io.qameta.allure.Allure.step;

/**
 * BasePage --- any page grandma. It has methods everyone needs
 */
public class BasePage {

    public static final String UPLOADS_FOLDER = "src/test/resources/uploads/";

    public void submit() {
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
    public void clickOn(SelenideElement element) {
        Report.screenshot(element.toString());
        element.click();
    }

    public SelenideElement $id(String testId) {
        return $("[data-testid=" + testId + "]");
    }

    public ElementsCollection $$id(String testId) {
        return $$("[data-testid=" + testId + "]");
    }

    public void dataMessage(String name, Map map) {
        step(name + "::: " + StringUtils.join(map));
    }

    public void dataMessage(String name, String data) {
        step(name + "::: " + data);
    }
}
