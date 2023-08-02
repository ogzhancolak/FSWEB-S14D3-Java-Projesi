package com.workintech.polymorphism;

import com.workintech.polymorphism.pasificcarcompany.parent.Ford;
import com.workintech.polymorphism.pasificcarcompany.parent.Holden;
import com.workintech.polymorphism.pasificcarcompany.parent.Mitsubishi;
import com.workintech.polymorphism.pasificcarcompany.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");

        System.out.println("\n" + car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake() + "\n");

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake() + "\n");

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake() + "\n");

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake() + "\n");
    }
}
