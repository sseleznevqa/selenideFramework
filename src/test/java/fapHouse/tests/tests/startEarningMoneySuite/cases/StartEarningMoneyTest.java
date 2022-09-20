package fapHouse.tests.tests.startEarningMoneySuite.cases;
import fapHouse.tests.pages.accountWizard.AccountWizardStepEmailConfirmationPage;
import fapHouse.tests.tests.startEarningMoneySuite.StartEarningMoneySuite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class StartEarningMoneyTest extends StartEarningMoneySuite {

    @Test
    @DisplayName("Start Earning Money (Successful flow)")
    void positiveFlow() {
        AccountWizardStepEmailConfirmationPage lastPage = toStepThreeRoutine()
                .uploadPassportImages(testData.documentSet);
        lastPage.message().shouldHave(text(testData.registrationForm.get("email")));
        lastPage.title().shouldHave(text(testData.finalTitle));
    }
}
