package com.pluralsight;

import com.pluralsight.finance.Jewelry;
import com.pluralsight.mariokart.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheApp {

    public static void main(String[] args) {

        //the garage that holds my valuables
        Garage myGarage = new Garage();

        //make the things that can be stored in my garage (valuables)
        StandardKart kart1 = new StandardKart("Lugi's Kart", 500, 5);
        JetKart kart2 = new JetKart("Boswers Jet Kart", 1000, 200);
        CoinPile thePileOfCoins = new CoinPile(500);
        Jewelry someNecklace = new Jewelry();

        //add all my valuables to my garage
        myGarage.addToMyGarage(kart1);
        myGarage.addToMyGarage(kart2);
        myGarage.addToMyGarage(thePileOfCoins);
        myGarage.addToMyGarage(someNecklace);

        System.out.println("====== Garage Inventory ======");
        myGarage.listMyValuables();
        System.out.println("My stuff is worth: " + myGarage.getTotalValue());


    }

}
