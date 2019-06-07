package io.zipcoder;

public class Cat extends Pet {

    public Cat(String name){
        super(name);
        this.type = "Cat";
    }




    @Override
    public String speak() {
        return "Meow";
    }
}
