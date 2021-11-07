package com.duckapp.client;

import com.duckapp.flybehavior.IFlyBehavior;
import com.duckapp.quackbehavior.IQuackBehavior;

public abstract class Duck {
    IQuackBehavior quackbehavior;
    IFlyBehavior flybehavior;

    public void performQuack() {
        quackbehavior.quack();
    }

    public void performFly() {
        flybehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior flybehavior) {
        this.flybehavior = flybehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackbehavior) {
        this.quackbehavior = quackbehavior;
    }

    public abstract void display();
}
