package com.pluralsight;

import java.util.ArrayList;

public class Garage {

    private ArrayList<IValuable> stuffInMyGarage;

    public Garage() {
        this.stuffInMyGarage = new ArrayList<>();
    }

    public void addToMyGarage(IValuable someThingOfValue){
        this.stuffInMyGarage.add(someThingOfValue);
    }

    public double getTotalValue(){

        double total = 0;
        for(IValuable thingInTheGarage : stuffInMyGarage){
            total += thingInTheGarage.getValue();
        }

        return total;
    }

    public void listMyValuables(){
        for(IValuable thing : stuffInMyGarage){
            System.out.println(thing);
        }
    }

}
