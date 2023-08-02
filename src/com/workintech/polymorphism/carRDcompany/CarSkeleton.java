package com.workintech.polymorphism.carRDcompany;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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
