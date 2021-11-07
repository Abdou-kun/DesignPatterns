package com.weatheroroma.observers;

import com.weatheroroma.subject.Iobservable;

public class ThirdPartyDisplay implements Idisplay, Iobserver {
    private Iobservable weatherData;
    private float temperature;
    private float humidity;

    public ThirdPartyDisplay(Iobservable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Third party: " + this.temperature + "F degree " + this.humidity + "%");
    }

    @Override
    public void update(float temperature, float humidity, float presseur) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
