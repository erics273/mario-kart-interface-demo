package com.pluralsight.mariokart;

public class StandardKart extends Kart {

    public int reliablity;

    public StandardKart(String name, double value, int reliablity) {
        super(name, value);
        this.reliablity = reliablity;
    }

    @Override
    public double getValue() {
        return this.value + reliablity * 100;
    }

}
