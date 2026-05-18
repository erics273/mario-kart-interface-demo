package com.pluralsight;

public class House extends Asset {


    @Override
    public double getValue() {
        return this.basePrice * 180;

    }
}
