package com.assignment.inheritance;

public class Safari extends Browser {

    public Safari(String version) {
        super("Safari", version);
    }

    public void readerMode() {
        System.out.println("Safari opened in Reader Mode.");
    }

    public void fullScreenMode() {
        System.out.println("Safari switched to Full Screen Mode.");
    }
}
