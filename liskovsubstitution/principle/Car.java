package com.yolkar62.solidprinciples.liskovsubstitution.principle;

public class Car extends VehiclesWithEngine {
    @Override
    public void price() {
        super.price();
    }

    @Override
    public void EngineType() {
        super.EngineType();
    }

    @Override
    public void ValueOfHorsePower() {
        super.ValueOfHorsePower();
    }

    @Override
    public void model() {
        super.model();
    }
}
