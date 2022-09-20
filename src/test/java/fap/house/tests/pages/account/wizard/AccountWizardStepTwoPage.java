package fap.house.tests.pages.account.wizard;

import com.codeborne.selenide.Selenide;
import fap.house.tests.pages.BasePage;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class AccountWizardStepTwoPage implements AccountWizardPage, BasePage {
    public AccountWizardStepThreePage agreeWithTerms() {
        step("Confirming terms");
        $("#field-element-contractSigned").click();
        submit();
        return Selenide.page(AccountWizardStepThreePage.class);
    }
}
