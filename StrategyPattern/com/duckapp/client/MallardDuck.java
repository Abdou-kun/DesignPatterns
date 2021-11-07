package com.duckapp.client;

import com.duckapp.flybehavior.FlyWithWings;
import com.duckapp.quackbehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flybehavior = new FlyWithWings();
        quackbehavior = new Quack();
    }

    public void display() {
        System.out.println("Hello, I'm a Mallard Duck");
    }
}
