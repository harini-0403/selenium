package com.assignment.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Chrome object
        Chrome chrome = new Chrome("116.0");
        chrome.openURL();
        chrome.openIncognito();
        chrome.clearCache();
        chrome.closeBrowser();

        System.out.println("-------------------");

        // Edge object
        Edge edge = new Edge("115.0");
        edge.openURL();
        edge.takeSnap();
        edge.clearCookies();
        edge.navigateBack();
        edge.closeBrowser();

        System.out.println("-------------------");

        // Safari object
        Safari safari = new Safari("16.0");
        safari.openURL();
        safari.readerMode();
        safari.fullScreenMode();
        safari.closeBrowser();
    }
}
