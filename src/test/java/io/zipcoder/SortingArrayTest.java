package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SortingArrayTest {

    @Test
    public void sortTheArray() {
        ArrayList<Pet> petList = new ArrayList<>();
        SortingArray sortingArray = new SortingArray();
        Pet pet1 = new Cat("Pookie");
        Pet pet2 = new Dog("Wile");
        Pet pet3 = new Bird("Tweetie");
        petList.add(pet1);
        petList.add(pet2);
        petList.add(pet3);
        System.out.println(sortingArray.sortTheArray(petList).toString());
        String expected = "Bird";
        assertEquals(expected, petList.get(0).getType() );
    }

}