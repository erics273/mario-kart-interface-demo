package com.pluralsight;

public abstract class Kart implements IValuable {

    public String name;
    public double value;

    public Kart(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + name + ") - Value: " + getValue();
    }

}
