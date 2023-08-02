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
        return getName() + " being drive.";
    }

    public void runEngine(CarSkeleton carSkeleton) {

        if(carSkeleton instanceof GasPoweredCar) {
            System.out.println("Gas powered engine started.");
        }else if (carSkeleton instanceof ElectricCar){
            System.out.println("Electric engine started.");
        }else if (carSkeleton instanceof HybridCar){
            System.out.println("Hybrid engine started.");
        }
    }
}
