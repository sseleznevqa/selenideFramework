package fapHouse.tests.pages.accountWizard;

import com.codeborne.selenide.Selenide;
import fapHouse.tests.helpers.testData.StartEarningMoneyData;
import org.openqa.selenium.By;

import java.util.Map;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static io.qameta.allure.Allure.step;

public class AccountWizardStepOnePage extends AccountWizardPage {
    public AccountWizardStepOnePage fillPersonalData(Map<String, String> testData) {
        dataMessage("Filling personal data", testData);
        $("#field-element-firstname").setValue(testData.get("firstName"));
        $("#field-element-lastname").setValue(testData.get("lastName"));
        $("#field-element-stageName").setValue(testData.get("stageName"));
        // Tricky field wanna be in a spotlight ;)
        $("input#field-element-birthday").click();
        // And we cannot clear it normally in Firefox
        Selenide.executeJavaScript("arguments[0].select()", $("input#field-element-birthday"));
        $("input#field-element-birthday").sendKeys(testData.get("date"));
        return this;
    }

    public AccountWizardStepOnePage selectCountry(String country) {
        $("input#field-element-addressCountryCode").setValue(country);
        $("#field-element-addressCountryCode").click();
        $(By.xpath("//button[text()='" + country + "']")).click();
        return this;
    }

    public AccountWizardStepOnePage fillAddressData(Map<String, String> testData) {
        dataMessage("Filling address", testData);
        $("#field-element-addressRegion").setValue(testData.get("region"));
        $("#field-element-addressCity").setValue(testData.get("city"));
        $("#field-element-addressPostCode").setValue(testData.get("postCode"));
        $("#field-element-addressStreet").setValue(testData.get("street"));
        return this;
    }

    public AccountWizardStepTwoPage next() {
        submit();
        return page(AccountWizardStepTwoPage.class);
    }

}
