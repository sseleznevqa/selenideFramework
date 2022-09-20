package fap.house.tests.helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.step;

/**
 * TestHelper --- things which is necessary for every Test class
 * use like:
 * public class YourTest extends TestHelper...
 */
@ExtendWith({ScreenShooterExtension.class})
@ExtendWith(TestLogger.class)
public class TestHelper {
    @BeforeAll
    public static void config() {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true)
                        .includeSelenideSteps(true));
        Configuration.browser = System.getProperty("browser");
        Configuration.baseUrl = "https://studio.faphouse.com/";
        Configuration.pageLoadTimeout = 30000;
        Configuration.timeout = 30000;
    }

    @BeforeEach()
    public void environmentMessage() {
        // TODO: Add more useful things here
        step("This test was running in " + System.getProperty("browser"));
    }

    @AfterEach()
    public void deleteCookies() {
        getWebDriver().manage().deleteAllCookies();
    }
}
