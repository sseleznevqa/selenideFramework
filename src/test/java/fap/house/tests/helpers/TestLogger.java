package fap.house.tests.helpers;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

/**
 * TestLogger --- is to hijack junit 5 standard report events and play
 */
public class TestLogger implements TestWatcher {

    @Override
    public void testSuccessful(ExtensionContext context) {
        Report.screenshot("Success");
    }

//    @Override
//    public void testFailed(ExtensionContext context, Throwable cause) {
//        // That is the place to catch console errors from chrome
//        // Retrieving video
//        // Or collect whatever data
//        // TODO: Implement it one day...
//    }

}
