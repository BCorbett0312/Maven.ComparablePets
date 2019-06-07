package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneratePetObjects {
    Scanner scanner = new Scanner(System.in);
    Console myConsole = new Console();
    ArrayList<Pet> petArrayList = new ArrayList<>();

    public void makePet(String petType){
        myConsole.askForPetName();
        String petName = scanner.next();
        switch (petType){
            case "dog":
                petArrayList.add(new Dog(petName));
                break;
            case "cat":
                petArrayList.add(new Cat(petName));
                break;
            case "bird":
                petArrayList.add(new Bird(petName));
                break;
            case "fox":
                petArrayList.add(new Fox(petName));
                break;
        }

    }

    public ArrayList<Pet> sendArrayList(){
        return petArrayList;
    }

}
