package fap.house.tests.pages.account.wizard;

import com.codeborne.selenide.SelenideElement;
import fap.house.tests.pages.BasePage;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AccountWizardStepThreePage implements AccountWizardPage, BasePage {
    private File id;
    private File secondPage;
    private File withId;

    public SelenideElement passportValidationError() {
        return $id("form-field-passport-error");
    }

    public SelenideElement passportWithPhotoValidationError() {
        return $id("form-field-photoWithPassport-error");
    }

    public AccountWizardStepEmailConfirmationPage uploadPassportImages(String set) {
        dataMessage("Uploading photos as", set);
        documentsSet(set);
        $("#field-element-passport").
                uploadFile(id);
        $("#field-element-passportSecondPage").
                uploadFile(secondPage);
        $("#field-element-photoWithPassport").
                uploadFile(withId);
        submit();
        return page(AccountWizardStepEmailConfirmationPage.class);
    }

    public AccountWizardStepThreePage documentsSet(String set) {
        String path = UPLOADS_FOLDER + "startEarningMoneyFiles/" + set + "/";
        id = new File(path + "id.png");
        secondPage = new File(path + "secondPage.png");
        withId = new File(path + "withId.png");
        return this;
    }
}
