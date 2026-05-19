package com.pluralsight.finance;

public class House extends Asset {


    @Override
    public double getValue() {
        return this.basePrice * 180;

    }
}
