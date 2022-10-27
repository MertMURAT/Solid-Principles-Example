package com.yolkar62.solidprinciples.openclosed.principle;

public class VehicleCalculation {
    public double calculateValue(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return vehicle.calculatePrice() * 0.8;
        } else if (vehicle instanceof Truck) {
            return vehicle.calculatePrice() * 2;
        }
        return vehicle.calculatePrice();
    }
}
