package io.zipcoder;

public class Bird extends Pet {
    public Bird(String name) {
        super(name);
        this.type = "Bird";
    }


    @Override
    public String speak() {
        return "Tweet";
    }
}
