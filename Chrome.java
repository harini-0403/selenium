package com.assignment.inheritance;

public class Chrome extends Browser {

    public Chrome(String version) {
        super("Chrome", version);
    }

    public void openIncognito() {
        System.out.println("Chrome is opening in Incognito Mode.");
    }

    public void clearCache() {
        System.out.println("Chrome cache cleared.");
    }
}
