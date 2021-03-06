package com.desgin.patterns.observer.inbuilt;

/**
 * Created by Yann on 2015/5/29.
 */
public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 70, 29.2f);
    }
}
