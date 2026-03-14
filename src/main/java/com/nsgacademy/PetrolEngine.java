package com.nsgacademy;

public class PetrolEngine implements Engine{
    private FuelPump fuelPump;

    public PetrolEngine() {
    }

    public PetrolEngine(FuelPump fuelPump) {
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
        System.out.println("Petrol Engine Started...");
    }
}
