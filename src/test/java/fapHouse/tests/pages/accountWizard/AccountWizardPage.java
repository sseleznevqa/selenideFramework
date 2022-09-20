package fapHouse.tests.pages.accountWizard;

import com.codeborne.selenide.SelenideElement;
import fapHouse.tests.pages.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class AccountWizardPage extends BasePage {
    public SelenideElement title() {
        return $("#wizard-page-title");
    }
}
