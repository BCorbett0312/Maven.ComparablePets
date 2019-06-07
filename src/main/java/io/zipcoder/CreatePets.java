package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePets {
    Console myConsole = new Console();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Pet> petArrayList = new ArrayList<Pet>();

    public ArrayList<Pet> createPets(Integer numPets) {
        if (numPets < 0) {
            myConsole.youGotNoPetsDummy();
        }

        while (numPets > 0) {
            for (int i = 0; i < numPets; i++) {
                myConsole.askForPetType();
                String petType = scanner.next().toLowerCase();

                if (petType.equals("cat")) {
                    myConsole.askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(new Cat(petName));
                    numPets--;

                } else if (petType.equals("dog")) {
                    myConsole.askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(new Dog(petName));
                    numPets--;
                } else if (petType.equals("fox")) {
                    myConsole.askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(new Fox(petName));
                    numPets--;
                } else if (petType.equals("bird")) {
                    myConsole.askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(new Bird(petName));
                    numPets--;
                } else {
                    myConsole.enterValidPet();
                    i--;
                }
            }


        }
        return petArrayList;
    }
}

