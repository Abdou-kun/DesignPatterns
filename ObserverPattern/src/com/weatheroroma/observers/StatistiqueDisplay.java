package com.weatheroroma.observers;

import com.weatheroroma.subject.Iobservable;

public class StatistiqueDisplay implements Idisplay, Iobserver {
    private Iobservable weatherData;
    private float temperature;
    private float humidity;

    public StatistiqueDisplay(Iobservable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistique: " + this.temperature + "F degree and " + this.humidity + "% humidiy");
    }

    @Override
    public void update(float temperature, float humidity, float presseur) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
