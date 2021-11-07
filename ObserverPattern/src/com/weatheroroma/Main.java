package com.weatheroroma;

import com.weatheroroma.observers.CurentConditionDisplay;
import com.weatheroroma.observers.ForcastDisplay;
import com.weatheroroma.observers.ThirdPartyDisplay;
import com.weatheroroma.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurentConditionDisplay currentDisplay = new CurentConditionDisplay(weatherData);
        ThirdPartyDisplay thirdDiplay = new ThirdPartyDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);

        weatherData.setMeasurements(30, 80, 40);
    }
}
