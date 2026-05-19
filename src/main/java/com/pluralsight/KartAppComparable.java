package com.pluralsight;

import com.pluralsight.mariokart.JetKart;
import com.pluralsight.mariokart.Kart;
import com.pluralsight.mariokart.StandardKart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KartAppComparable {

    public static void main(String[] args) {

        List<Kart> karts = new ArrayList<Kart>();

        //create and add the kart at the same time to the karts list
        karts.add( new JetKart("Blue Falcon", 1500, 8) );
        karts.add( new JetKart("Blue Falcon", 2000, 7) );
        karts.add( new StandardKart("Pipe Dream", 750, 8) );
        karts.add( new JetKart("Cloud Jumper", 700, 10) );

        //loop over before sorting
        for(Kart currentKart : karts){
            System.out.println(currentKart.toString());
        }

        //lets sort the karts based on the rules in the compareTo method
        Collections.sort(karts);


        System.out.println("sorted");

        //loop over after sorting
        for(Kart currentKart : karts){
            System.out.println(currentKart.toString());
        }


    }

}
