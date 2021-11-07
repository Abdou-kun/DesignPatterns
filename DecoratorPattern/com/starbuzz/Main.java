package com.starbuzz;

import com.starbuzz.components.*;
import com.starbuzz.decorators.*;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Milk(new Espresso());
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
