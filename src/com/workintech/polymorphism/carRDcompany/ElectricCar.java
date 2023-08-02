package com.workintech.polymorphism.carRDcompany;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public String startEngine() {
        return getName() + " is starting engine.";
    }

    public String drive() {
        return getName() + " being drive." + runEngine();
    }

    protected String runEngine() {
        return getName() + " engine running.";
    }
}
