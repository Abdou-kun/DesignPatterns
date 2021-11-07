package com.starbuzz.decorators;

import com.starbuzz.components.Beverage;

public class Mocha extends Beverage {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .20;
    }
}
