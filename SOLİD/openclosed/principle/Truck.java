package com.yolkar62.solidprinciples.openclosed.principle;

public class Truck extends Vehicle{
    public double calculateValue() {
        return this.calculatePrice() * 2;
    }
}
