package io.zipcoder;

public class CheckPetValidity {


    public String checkPet(String petType) {
        if(petType.equals("cat")){
            return "cat";
        }
        else if (petType.equals("dog")){
            return "dog";
        }
        else if (petType.equals("fox")){
            return "fox";
        }
        else if(petType.equals("bird")){
            return "bird";
        }
        else{return "invalid";}





    }
}
