package com.nsgacademy;

public class DieselEngine implements Engine{
    private FuelPump fuelPump;

    public DieselEngine() {
    }

    public DieselEngine(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    public FuelPump getFuelPump() {
        return fuelPump;
    }

    public void setFuelPump(FuelPump fuelPump) {
        this.fuelPump = fuelPump;
    }

    @Override
    public void start() {
        fuelPump.work();
        System.out.println("Diesel Engine Started...");
    }
}
