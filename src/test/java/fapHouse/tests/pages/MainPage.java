package fapHouse.tests.pages;

import fapHouse.tests.pages.accountWizard.AccountWizardStepOnePage;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static io.qameta.allure.Allure.step;

public class MainPage extends BasePage{
    public AccountWizardStepOnePage startEarningMoney(Map<String, String> testData) {
        dataMessage("Filling basic fields", testData);
        $(By.name("username")).setValue(testData.get("userName"));
        $(By.name("email")).setValue(testData.get("email"));
        $(By.name("password")).setValue(testData.get("password"));
        submit();
        return page(AccountWizardStepOnePage.class);
    }
}
