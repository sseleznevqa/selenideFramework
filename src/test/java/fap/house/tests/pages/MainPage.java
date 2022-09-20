package fap.house.tests.pages;

import fap.house.tests.pages.account.wizard.AccountWizardStepOnePage;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage implements BasePage{
    public AccountWizardStepOnePage startEarningMoney(Map<String, String> testData) {
        dataMessage("Filling basic fields", testData);
        $(By.name("username")).setValue(testData.get("userName"));
        $(By.name("email")).setValue(testData.get("email"));
        $(By.name("password")).setValue(testData.get("password"));
        submit();
        return page(AccountWizardStepOnePage.class);
    }
}
