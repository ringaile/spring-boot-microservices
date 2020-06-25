package com.example.microservice.limitsservice.bean;

public class LimitsConfiguration {
    private int maximum;
    private int minimum;

    protected LimitsConfiguration(){}

    public LimitsConfiguration(final int maximum, final int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
}
