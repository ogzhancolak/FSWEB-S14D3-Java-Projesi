package com.workintech.polymorphism.carRDcompany;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
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
