package com.yolkar62.solidprinciples.liskovsubstitution.principle;

public class Bike extends VehicleWithoutEngine {
    @Override
    public void price() {
        super.price();
    }


    @Override
    public void ValueOfHorsePower() {
        super.ValueOfHorsePower();
    }

    @Override
    public void model() {
        super.model();
    }

    @Override
    public void pedalType() {
        super.pedalType();
    }
}
