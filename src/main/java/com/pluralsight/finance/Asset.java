package com.pluralsight.finance;

public abstract class Asset implements IValuable {

    public String name;
    public double basePrice;

    @Override
    public String toString() {
        return "Asset - Value: " + getValue();
    }

}
