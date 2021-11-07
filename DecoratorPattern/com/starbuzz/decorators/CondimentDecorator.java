package com.starbuzz.decorators;

import com.starbuzz.components.Beverage;

public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
