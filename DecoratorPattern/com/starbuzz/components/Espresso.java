package com.starbuzz.components;

import jdk.jfr.Description;

public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
