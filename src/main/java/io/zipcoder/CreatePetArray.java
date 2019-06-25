package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePetArray {
    private Console myConsole;
    private Scanner scanner;
    private CheckPetValidity check = new CheckPetValidity();
    private GeneratePetObjects makePets = new GeneratePetObjects();
    private ArrayList<Pet> petArrayList = new ArrayList<>();

    public CreatePetArray(Console console, Scanner scanner){
        myConsole = console;
        this.scanner = scanner;

    }
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
                    myConsole.askForPetName();
                    String petName = scanner.next();
                    petArrayList.add(makePets.makePet(petType, petName));
                    numPets--;
                }

            }
        }
        return petArrayList;
    }
}

