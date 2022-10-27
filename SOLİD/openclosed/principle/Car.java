package com.yolkar62.solidprinciples.openclosed.principle;

public class Car extends Vehicle{
    public double calculatePrice() {
        return this.calculatePrice() * 0.8;
    }
}
