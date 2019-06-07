package io.zipcoder;

public abstract class Pet {
    private String name;
    public String type;

    public Pet(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String speak(){

        return "Animal Noise";
    }
}
