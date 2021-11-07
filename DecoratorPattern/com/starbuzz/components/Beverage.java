package com.starbuzz.components;

public abstract class Beverage {
    protected String description = "UnKnown Beverage";
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
