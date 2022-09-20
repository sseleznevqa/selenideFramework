package fap.house.tests.tests.start.earning.money.suite.cases;
import fap.house.tests.pages.account.wizard.AccountWizardStepEmailConfirmationPage;
import fap.house.tests.tests.start.earning.money.suite.StartEarningMoneySuite;
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
