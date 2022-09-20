package fap.house.tests.pages.account.wizard;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public interface AccountWizardPage {
    default SelenideElement title() {
        return $("#wizard-page-title");
    }
}
