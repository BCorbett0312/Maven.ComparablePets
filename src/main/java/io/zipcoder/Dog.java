package io.zipcoder;

public class Dog extends Pet {

    public Dog(String name){
        super(name);
        this.type = "Dog";
    }


    @Override
    public String speak() {
        return "Woof";
    }
}
