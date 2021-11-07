package com.starbuzz.components;

public class DarkRoast extends Beverage {
    public DarkRoast() {
    this.description = "DarkRoast";
    }
    
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double cost() {
        return 0.99;
    }
    
}
