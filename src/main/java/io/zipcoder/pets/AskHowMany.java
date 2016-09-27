package io.zipcoder.pets;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by nazhirjackson on 9/26/16.
 */
public class AskHowMany {
    private int howMany;
    private List<Pet> petsList = new ArrayList();
    private String petName;
    private String petType;

    public void ask(){
        Scanner ask = new Scanner(System.in);
        System.out.println("How many pets do you have? ");
        howMany = ask.nextInt();
        for(int i= 1; i<=howMany; i++) {
            System.out.println("What type of pet is this one?");
            petType = ask.next();
            System.out.println("What's its name");
            petName = ask.next();
            addPet();

        }
        printContents();
    }

    public void addPet(){
        petsList.add(new Pet(petName, petType));
    }
    public void printContents(){
        for (Pet p:petsList) {
            Pet b = p.determineType();
            System.out.println(b.toString());
        }

    }


    public static void main(String[] args) {
        AskHowMany p = new AskHowMany();

        p.ask();
    }

}
