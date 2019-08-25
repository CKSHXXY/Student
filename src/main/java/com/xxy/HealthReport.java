package com.xxy;

public class HealthReport implements Report {

    @Override
    public void print() {
        System.out.println("Health printing data:");
    }

    @Override
    public void load() {
        System.out.println("Health loading data:");
    }
}
