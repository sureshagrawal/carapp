package com.nsgacademy;

public class Car {
    private Battery battery;
    private Engine engine;
    private Tyre tyre;

    public Car() {
    }

    public Car(Battery battery, Engine engine, Tyre tyre) {
        this.battery = battery;
        this.engine = engine;
        this.tyre = tyre;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive(){
        battery.supplyPower();
        engine.start();
        tyre.rotate();
        System.out.println("car is running");
    }

    @Override
    public String toString() {
        return "Car{" +
                "battery=" + battery +
                ", engine=" + engine +
                ", tyre=" + tyre +
                '}';
    }
}
