package io.zipcoder;


import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Console myConsole = new Console();
        CreatePetArray myPets = new CreatePetArray();
        ArrayList<Pet> petArrayList;
        SortingArray sorted = new SortingArray();



        petArrayList = myPets.createPets(myConsole.askHowManyPets());


        myConsole.printList(petArrayList);

        myConsole.printList(sorted.sortTheArray(petArrayList));


    }
}
