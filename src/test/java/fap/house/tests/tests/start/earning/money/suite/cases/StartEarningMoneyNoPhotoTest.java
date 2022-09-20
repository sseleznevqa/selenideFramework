package fap.house.tests.tests.start.earning.money.suite.cases;

import fap.house.tests.pages.account.wizard.AccountWizardStepThreePage;
import fap.house.tests.tests.start.earning.money.suite.StartEarningMoneySuite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
