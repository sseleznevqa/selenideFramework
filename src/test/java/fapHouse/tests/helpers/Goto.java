package fapHouse.tests.helpers;

import fapHouse.tests.pages.*;

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
