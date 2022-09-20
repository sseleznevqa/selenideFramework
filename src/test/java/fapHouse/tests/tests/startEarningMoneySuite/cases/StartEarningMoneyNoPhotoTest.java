package fapHouse.tests.tests.startEarningMoneySuite.cases;

import fapHouse.tests.helpers.Report;
import fapHouse.tests.pages.accountWizard.AccountWizardStepThreePage;
import fapHouse.tests.tests.startEarningMoneySuite.StartEarningMoneySuite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.codeborne.selenide.Condition.exactText;

public class StartEarningMoneyNoPhotoTest extends StartEarningMoneySuite {
    @Test
    @DisplayName("Start Earning Money (No photos flow)")
    void noPhotoFlow() {
        AccountWizardStepThreePage stepThreePage = toStepThreeRoutine();
        stepThreePage.submit();
        stepThreePage.passportValidationError().shouldHave(exactText("Passport is required"));
        stepThreePage.passportWithPhotoValidationError().shouldHave(exactText("Photo with passport is required"));
    }
}
