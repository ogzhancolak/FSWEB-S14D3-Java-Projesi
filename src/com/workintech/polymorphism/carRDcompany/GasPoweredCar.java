package com.workintech.polymorphism.carRDcompany;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
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
