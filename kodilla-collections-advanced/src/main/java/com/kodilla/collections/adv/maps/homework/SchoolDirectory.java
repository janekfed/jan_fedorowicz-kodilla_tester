package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<SchoolNumber, Principal> directorAndSchool = new HashMap<>();
        SchoolNumber elementarySchool = new SchoolNumber(1);
        SchoolNumber middleSchool = new SchoolNumber(2);
        SchoolNumber highSchool = new SchoolNumber(3);

        Principal brainKovalsky = new Principal("Brian", "Kovalsky");
        Principal stacyOConor = new Principal("Stacy", "O'Conor");
        Principal eltonJohn = new Principal("Elton", "John");

        directorAndSchool.put(elementarySchool, eltonJohn);
        directorAndSchool.put(middleSchool, brainKovalsky);
        directorAndSchool.put(highSchool, stacyOConor);

        for (Map.Entry<SchoolNumber, Principal> schoolDirectory : directorAndSchool.entrySet())
            System.out.println(schoolDirectory.getKey().toString() + schoolDirectory.getValue().toString());
    }
}
