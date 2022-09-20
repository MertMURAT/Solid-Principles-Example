package com.yolkar62.solidprinciples.openclosed.principle;

public class Vehicle {
    public double calculatePrice() {
        return 100;
    }
    public double calculator(String value){
        if (value.equals("Car")) {
            return 100 * 0.8;
        } else if (value.equals("Truck")) {
            return 100 * 0.2;
        }
        return 100;
    }
}
