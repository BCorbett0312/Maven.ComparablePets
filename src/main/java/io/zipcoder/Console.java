package io.zipcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);

    public Integer askHowManyPets(){
        System.out.println("How many pets do you have?"+ "\nEnter 0 to quit");
        while (!scanner.hasNextInt()) {
            System.out.println("That is not a valid number of animals");
            scanner.next();
        }
         Integer numberOfPets = scanner.nextInt();
            return numberOfPets;
    }

    public void askForPetType() {
        System.out.println("Is the pet a cat, dog, bird, or fox?");
    }
    public void askForPetName() {
        System.out.println("What is the name of that pet");
    }

    public void  printList(ArrayList<Pet> myList) {


        for (
                int i = 0; i < myList.size(); i++) {
            System.out.println("The animal named " + myList.get(i).getName() + " says " + myList.get(i).speak() + "!");

        }

    }

    public void youGotNoPetsDummy(){
        System.out.println("It appears you have no pets and do not need this application." +
                "\nIf you have pets restart and enter a positive number");
    }

    public void enterValidPet(){
        System.out.println("Please enter a valid pet type");
    }


}
