package fap.house.tests.pages.account.wizard;

import com.codeborne.selenide.SelenideElement;
import fap.house.tests.pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class AccountWizardStepEmailConfirmationPage implements AccountWizardPage, BasePage {
    public SelenideElement message() {
        return $("section");
    }
}
