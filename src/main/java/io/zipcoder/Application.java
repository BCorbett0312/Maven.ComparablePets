package io.zipcoder;


import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Console myConsole = new Console();
        Scanner scanner = new Scanner(System.in);
        CreatePetArray myPets = new CreatePetArray(myConsole, scanner);
        ArrayList<Pet> petArrayList;
        SortingArray sorted = new SortingArray();

        petArrayList = myPets.createPets(myConsole.askHowManyPets());

        System.out.println("Your pets in no particular order are as follows");
        myConsole.printList(petArrayList);
        System.out.println("The list is sorted below by type then by name");
        myConsole.printList(sorted.sortTheArray(petArrayList));


    }
}
