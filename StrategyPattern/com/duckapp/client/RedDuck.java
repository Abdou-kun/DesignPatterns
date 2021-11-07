package com.duckapp.client;

import com.duckapp.flybehavior.FlyNoWay;
import com.duckapp.quackbehavior.MuteQuack;

public class RedDuck extends Duck {
    public RedDuck() {
        this.flybehavior = new FlyNoWay();
        this.quackbehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("Hello, I'm Red Head Duck");
    }
}
