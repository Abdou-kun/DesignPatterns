package com.weatheroroma.subject;

import com.weatheroroma.observers.Iobserver;

public interface Iobservable {
    public void registerObserver(Iobserver o);
    public void deliteObserver(Iobserver o);
    public void notifyObserver();
}
