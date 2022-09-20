package fap.house.tests.helpers;

import fap.house.tests.pages.BasePage;
import fap.house.tests.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Goto --- Kinda minimal PageFactory
 * It knows what page is for what url, so all the starting urls should be at one place
 */
public class Goto {
    public static BasePage page(String url) {
        switch (url) {
            case "": return open("", MainPage.class);
            default: return open("404", BasePage.class);
        }
    }
}
