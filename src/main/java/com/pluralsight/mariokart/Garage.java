package com.pluralsight.mariokart;

import com.pluralsight.finance.IValuable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Garage {

    private List<IValuable> stuffInMyGarage;

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
