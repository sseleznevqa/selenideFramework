package fapHouse.tests.tests.startEarningMoneySuite;

import fapHouse.tests.helpers.Goto;
import fapHouse.tests.helpers.TestHelper;
import fapHouse.tests.helpers.testData.StartEarningMoneyData;
import fapHouse.tests.pages.accountWizard.AccountWizardStepThreePage;
import fapHouse.tests.pages.MainPage;
import org.junit.jupiter.api.BeforeEach;

/**
 * StartEarningMoneySuite --- suite of StartEarningMoney tests
 * It contains routines which could be used by testcases
 * It also may do some configuration or hold testData for suite
 */
public class StartEarningMoneySuite extends TestHelper {
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
