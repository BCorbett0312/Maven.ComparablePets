package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneratePetObjects {
    Scanner scanner = new Scanner(System.in);
    Console myConsole = new Console();
    ArrayList<Pet> petArrayList = new ArrayList<>();

    public Pet makePet(String petType){
        myConsole.askForPetName();
        String petName = scanner.next();
        switch (petType){
            case "dog":
                return new Dog(petName);

            case "cat":
                return new Cat(petName);

            case "bird":
                return new Bird(petName);

            case "fox":
                return new Fox(petName);

        }
    return null;
    }



}
