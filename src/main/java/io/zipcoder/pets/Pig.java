package io.zipcoder.pets;

/**
 * Created by nazhirjackson on 9/26/16.
 */
public class Pig extends Pet {
    private String speak = "Oink Oink!!";

    public Pig(String petName) {
        super.name = petName;

    }

    @Override
    public String speak() {
        return speak;
    }
    @Override
    public String toString(){
        return String.format("This pets name is "+name+ " and it goes "+speak());
    }
}
