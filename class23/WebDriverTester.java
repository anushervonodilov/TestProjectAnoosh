package com.class23;

public class WebDriverTester {
    public static void main(String[] args) {

//        WebDriver webDriver = new FireFox();
//        webDriver.startBrowser();
//        webDriver.openURL();
//        webDriver.testLoginPage();
//        webDriver.closeBrowser();

        WebDriver[] browsers = {new Chrome(), new Safari(), new FireFox()};

        for (WebDriver browser : browsers) {
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }


    }
}
