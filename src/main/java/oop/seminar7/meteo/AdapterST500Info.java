package oop.seminar7.meteo;

import java.time.LocalDateTime;

public class AdapterST500Info implements  MeteoSensor{
    private  SensorTemperature adaptee;

    public AdapterST500Info(SensorTemperature adaptee) {
        this.adaptee = adaptee;
    }

    public AdapterST500Info() {
    }

    @Override
    public int getId() {
        return adaptee.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adaptee.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adaptee.year(), 1,1,0,0);
        dateTime.plusDays(adaptee.day());
        dateTime.plusSeconds(adaptee.second());
        return dateTime;
    }
}
