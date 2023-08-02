package com.workintech.polymorphism.carRDcompany;

import com.workintech.polymorphism.pasificcarcompany.Car;

public class MainRd {
    public static void main(String[] args) {

        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "Gas powered car", 5.5,4);
        CarSkeleton hybridCar = new HybridCar("Hybrid Car","Hybrid powered car", 3.1,500,4);
        CarSkeleton electricCar = new ElectricCar("Electric Car", "Electric powered car", 10.5,1000);

        testDrive(gasCar);
        System.out.println("");
        testDrive(hybridCar);
        System.out.println("");
        testDrive(electricCar);
    }

    public static void testDrive(CarSkeleton car) {
        System.out.println("Car name: " + car.getName());
        System.out.println("Description: " + car.getDescription());
        car.startEngine();
        car.drive();

        if(car instanceof GasPoweredCar) {
            GasPoweredCar gas = (GasPoweredCar) car;
            System.out.println("Avg Km Lt: " + gas.getAvgKmPerLitre());
            System.out.println("Cylinders: " + gas.getCylinders());
        } else if (car instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) car;
            System.out.println("Avg Km Lt: " + hybridCar.getAvgKmPerLitre());
            System.out.println("Battery Size: " + hybridCar.getBatterySize());
            System.out.println("Cylinders: " + hybridCar.getCylinders());
        } else if (car instanceof ElectricCar) {
            ElectricCar electricCar = (ElectricCar) car;
            System.out.println("Avg Km Lt: " + electricCar.getAvgKmPerCharge());
            System.out.println("Battery Size: " + electricCar.getBatterySize());
        }
    }
}
