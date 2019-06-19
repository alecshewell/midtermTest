package animalexample;

import java.util.Scanner;

/**
 *
 * @author paulbonenfant
 */
public class AnimalExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dog dog = new Dog("Lucky", "Paul");
        Dog dog2 = new Dog("Lucky", "Paul");
        Dog dog3 = dog;

        System.out.println(dog.equals(dog2));
        System.out.println(dog.equals(dog3));

        Cat cat = new Cat("Fluffy");
        Hamster hamster = new Hamster("John");

        System.out.println("Hamster play " + hamster.play());
        System.out.println("Hamster makeSound " + hamster.makeSound());
        System.out.println("Dog play: " + dog.play());
        System.out.println("Dog makeSound: " + dog.makeSound());

        System.out.println("Cat play: " + cat.play());

        Scanner input = new Scanner(System.in);

        System.out.println("Is the cat scared?");
        String scared = input.nextLine();

        if (scared.equalsIgnoreCase("Y")) {
            System.out.println("Cat makeSound: " + cat.makeSound(true));
        } else {
            System.out.println("Cat makeSound: " + cat.makeSound());
        }
    }

    private static String invokePlay(Animal animal) {
        return animal.play();
    }

    private static String invokeSound(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            Scanner input = new Scanner(System.in);

            System.out.println("Is the cat scared?");
            String scared = input.nextLine();

            if (scared.equalsIgnoreCase("Y")) {
                System.out.println("Cat makeSound: " + cat.makeSound(true));
            } else {
                System.out.println("Cat makeSound: " + cat.makeSound());
            }
        }
        return animal.makeSound();
    }

}
