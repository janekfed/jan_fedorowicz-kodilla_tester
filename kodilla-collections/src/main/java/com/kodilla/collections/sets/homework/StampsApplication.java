package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add (new Stamp("firstStamp", 4,3,true));
        stamps.add(new Stamp("secondStamp", 5,4, false));
        stamps.add(new Stamp("thirdStamp",3, 4, false));
        stamps.add(new Stamp("firstStamp", 4, 3, true));

        System.out.println(stamps.size());
        for(Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
