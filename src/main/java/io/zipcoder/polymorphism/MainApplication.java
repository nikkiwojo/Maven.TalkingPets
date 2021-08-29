package io.zipcoder.polymorphism;
import java.util.Scanner;


public class MainApplication {

    
    public static void main(String[] args){

        // Setting up generic objects
        Scanner scan = new Scanner(System.in);
        pets talk = new pets();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();
        int counter = 1;

        // Asks the user to input the number of pets they own
        System.out.println("---Welcome to the Pet Data Set---");
        System.out.println("How many pets do you own?");
        int numPets = scan.nextInt();

        System.out.println("What kind of pet do you have?");
        String pet = scan.nextLine();

        // Will ask them info about each of their pets
        // The loop will keep going until all pets have been accounted for
        while(counter < numPets) {
                if (pet.equalsIgnoreCase("dog")){
                    talk.speak();
                    dog.speak();
                } else if (pet.equalsIgnoreCase("cat")){
                    talk.speak();
                    cat.speak();
                } else if (pet.equalsIgnoreCase("parrot")){
                    talk.speak();
                    parrot.speak();
                }
                System.out.println("What kind of pet do you have?");
                pet = scan.nextLine();
                counter++;
        
        }
        scan.close();
    }
}
