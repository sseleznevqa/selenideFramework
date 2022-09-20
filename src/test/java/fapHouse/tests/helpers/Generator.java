package fapHouse.tests.helpers;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Generator --- Class to generate random things.
 */
public class Generator {
    public static String randomString(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public static String randomString() {
        return randomString(10);
    }

    public static String randomName() {
        String out = randomString();
        return out.substring(0, 1).toUpperCase() + out.substring(1).toLowerCase();
    }

    public static String randomEmail() {
        return ("autotest_" + randomString() + "@faphouse.com").toLowerCase();
    }
}
