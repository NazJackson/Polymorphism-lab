package io.zipcoder.pets;

/**
 * Created by nazhirjackson on 9/26/16.
 */
public class Cat extends Pet{
private String speak = "Meow!!";
    public Cat(String name) {
        super.name = name;
    }

    @Override
    public String speak() {
        return speak;
    }
    @Override
    public String toString(){
        return String.format("This pets name is "+name+ " It's a "+super.petType+" and it goes "+speak());
    }

}
