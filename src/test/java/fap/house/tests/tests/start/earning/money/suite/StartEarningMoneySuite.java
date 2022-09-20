package fap.house.tests.tests.start.earning.money.suite;

import fap.house.tests.helpers.Goto;
import fap.house.tests.helpers.TestHelper;
import fap.house.tests.helpers.test.data.StartEarningMoneyData;
import fap.house.tests.pages.account.wizard.AccountWizardStepThreePage;
import fap.house.tests.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;

/**
 * StartEarningMoneySuite --- suite of StartEarningMoney tests
 * It contains routines which could be used by testcases
 * It also may do some configuration or hold testData for suite
 */
public class StartEarningMoneySuite implements TestHelper {
    public StartEarningMoneyData testData;
    protected AccountWizardStepThreePage toStepThreeRoutine() {
        MainPage main = (MainPage) Goto.page("");
        return main
                .startEarningMoney(testData.registrationForm)
                .fillPersonalData(testData.personalData)
                // I've separated it since state based logic is highly possible here... I think
                .selectCountry(testData.personalAddress.get("country"))
                .fillAddressData(testData.personalAddress)
                .next()
                .agreeWithTerms();
    }

    @BeforeEach
    public void dataBrew() {
        testData = new StartEarningMoneyData();
    }
}
