package fapHouse.tests.pages.accountWizard;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AccountWizardStepEmailConfirmationPage extends AccountWizardPage {
    public SelenideElement message() {
        return $("section");
    }
}
