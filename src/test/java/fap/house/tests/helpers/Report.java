package fap.house.tests.helpers;

import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StepResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.ByteArrayInputStream;
import java.util.UUID;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.qameta.allure.Allure.addAttachment;

/**
 * Report --- Class to send things to Allure
 * So far only screenshot is here
 */
public final class Report {
    Report() {}

    public static void screenshot(String name) {
        StepResult result = new StepResult().setName(name);
        result.setStatus(Status.PASSED);
        String uuid = UUID.randomUUID().toString();
        Allure.getLifecycle().startStep(uuid, result);
        addAttachment(name,
                 new ByteArrayInputStream(((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES)));
        Allure.getLifecycle().stopStep(uuid);
    }

    public static void screenshot() {
        screenshot((System.currentTimeMillis() / 1000L) + "_screenshot");
    }
}
