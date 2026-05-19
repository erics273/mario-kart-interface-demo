package com.pluralsight.mariokart;

import com.pluralsight.finance.IValuable;

public abstract class Kart implements IValuable, Comparable<Kart> {

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

    @Override
    public int compareTo(Kart someOtherKart){

        //lets try to sort by name first as long as the names are differnt
        if(!this.name.equalsIgnoreCase(someOtherKart.name)){
           return this.name.compareToIgnoreCase(someOtherKart.name);
        }

        //we want to sort on value if the names are same
        return Double.compare(this.getValue(), someOtherKart.getValue());
    }

}
