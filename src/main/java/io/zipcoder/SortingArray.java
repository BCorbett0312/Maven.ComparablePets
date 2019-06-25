package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArray {

    private Comparator<Pet> newComparator = Comparator.comparing(Pet::getType).thenComparing(Pet::getName);

    public ArrayList<Pet> sortTheArray(ArrayList<Pet> myArrayList){
        Collections.sort(myArrayList, newComparator);
        return myArrayList;

    }
}
