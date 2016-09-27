package io.zipcoder.pets;

/**
 * Created by nazhirjackson on 9/26/16.
 */
public class Dog extends Pet {
    private String speak = "Bark!!";
    private String name;
    public Dog(String name) {

        this.name = name;
        super.speak = this.speak;
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
