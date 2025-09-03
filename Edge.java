package com.assignment.inheritance;

public class Edge extends Browser {

    public Edge(String version) {
        super("Edge", version);
    }

    public void takeSnap() {
        System.out.println("Edge took a snapshot.");
    }

    public void clearCookies() {
        System.out.println("Edge cookies cleared.");
    }
}
