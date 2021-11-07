package com.weatheroroma.subject;

import java.util.ArrayList;
import com.weatheroroma.observers.Iobserver;

public class WeatherData implements Iobservable {
    private ArrayList<Iobserver> observers;
    private float temperature;
    private float humidity;
    private float presseur;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Iobserver o) {
        observers.add(o);
    }

    @Override
    public void deliteObserver(Iobserver o) {
        if (observers.indexOf(o) >= 0)
            observers.remove(observers.indexOf(o));
    }

    @Override
    public void notifyObserver() {
        for (Iobserver observer : observers) {
            observer.update(this.temperature, this.humidity, this.presseur);
        }
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPresseur() {
        return this.presseur;
    }

    public void measurementsChanged() {
        notifyObserver();
    }
    
    public void setMeasurements(float temperature, float humidity, float presseur) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.presseur = presseur;
        measurementsChanged();
    }  
}
