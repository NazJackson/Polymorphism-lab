package io.zipcoder.pets;

/**
 * Created by nazhirjackson on 9/26/16.
 */
public class Pet  {
    protected String speak = "Speaking";
    protected String name = " ";
    protected String petType;

public Pet(){}
    public Pet(String petName, String petType){
        this.name = petName;
        this.petType = petType;

    }

    public String speak() {
        return speak;
    }
    public Pet determineType(){
        switch (petType.toLowerCase()) {
            case "dog":
                return new Dog(name);
            case "cat":
                return new Cat(name);
            case "pig":
                return new Pig(name);

            default:
        }
        return null;
    }
    public void setName(String name){ this.name = name;}
    public String getName(){ return name;}

    @Override
    public String toString(){
        return String.format("This pets name is "+name+ "and it goes "+speak);
    }

}
