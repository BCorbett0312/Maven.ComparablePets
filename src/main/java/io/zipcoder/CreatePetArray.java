package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePetArray {
    private Console myConsole = new Console();
    private Scanner scanner = new Scanner(System.in);
    private CheckPetValidity check = new CheckPetValidity();
    private GeneratePetObjects makePets = new GeneratePetObjects();
    private ArrayList<Pet> petArrayList = new ArrayList<>();

    public ArrayList<Pet> createPets(Integer numPets) {
        if (numPets < 0) {
            myConsole.youGotNoPetsDummy();
        }

        while (numPets > 0) {
            for (int i = 0; i < numPets; i++) {
                myConsole.askForPetType();
                String petType = scanner.next().toLowerCase();
                if (check.checkPet(petType).equals("invalid")) {
                    i--;
                    myConsole.enterValidPet();
                } else {
                    petArrayList.add(makePets.makePet(petType));
                    numPets--;
                }

            }
        }
        return petArrayList;
    }
}

