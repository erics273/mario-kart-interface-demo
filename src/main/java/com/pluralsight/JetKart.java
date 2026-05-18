package com.pluralsight;

public class JetKart extends Kart{

    private int turbolevel;

    public JetKart(String name, double value, int turbolevel) {
        super(name, value);
        this.turbolevel = turbolevel;
    }

    @Override
    public double getValue() {
        return this.value + this.turbolevel * 100;
    }
}
