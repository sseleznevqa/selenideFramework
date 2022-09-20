package fapHouse.tests.pages.accountWizard;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AccountWizardStepTwoPage extends AccountWizardPage {
    public AccountWizardStepThreePage agreeWithTerms() {
        $("#field-element-contractSigned").click();
        submit();
        return page(AccountWizardStepThreePage.class);
    }
}
