package fapHouse.tests.pages.accountWizard;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static io.qameta.allure.Allure.step;

public class AccountWizardStepTwoPage extends AccountWizardPage {
    public AccountWizardStepThreePage agreeWithTerms() {
        step("Confirming terms");
        $("#field-element-contractSigned").click();
        submit();
        return page(AccountWizardStepThreePage.class);
    }
}
