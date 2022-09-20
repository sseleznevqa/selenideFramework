package fap.house.tests.helpers.test.data;

import fap.house.tests.helpers.Generator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * StartEarningMoneyData --- Vault for StartEarningMoney test data.
 */
public class StartEarningMoneyData {

    public Map<String, String> registrationForm = new HashMap<>();
    public Map<String, String> personalData = new HashMap<>();
    public Map<String, String> personalAddress = new HashMap<>();
    public String documentSet = new Random().nextBoolean() ? "fomaKinyaev" : "frankColumbo";
    public String finalTitle = "Complete registration on FapHouse";

    public StartEarningMoneyData() {
        registrationForm.put("userName", Generator.randomName());
        registrationForm.put("email", Generator.randomEmail());
        registrationForm.put("password", Generator.randomString());

        personalData.put("firstName", Generator.randomName());
        personalData.put("lastName", Generator.randomName());
        personalData.put("stageName", Generator.randomName() + ' ' + Generator.randomName());
        personalData.put("date", "19971212"); // Not so random...

        personalAddress.put("country", "Albania");
        personalAddress.put("region", Generator.randomName());
        personalAddress.put("city", Generator.randomName());
        personalAddress.put("postCode", Generator.randomName());
        personalAddress.put("street", "Apt 17, 18 of " + Generator.randomName() + " street"); // Not so random...
    }

}
