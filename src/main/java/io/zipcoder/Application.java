package io.zipcoder;


import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Console myConsole = new Console();
        CreatePets myPets = new CreatePets();
        ArrayList<Pet> petArrayList;

        petArrayList = myPets.createPets(myConsole.askHowManyPets());


        myConsole.printList(petArrayList);



    }
}
