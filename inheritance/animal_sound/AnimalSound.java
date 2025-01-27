// Define a superclass Animal
package inheritance.animal_sound;

// Main class to test the Animal sounds
public class AnimalSound {
    public static void main(String[] args) {
        // Create instances of Dog, Cat, and Bird
        Dog dog = new Dog("husky", 2);
        Cat cat = new Cat("persian cat", 5);
        Bird bird = new Bird("vulture", 3);

        // Output the details and sounds of each animal
        System.out.println("Name: " + dog.getName() + " and age is " + dog.getAge() + " sound");
        dog.makeSound();
        System.out.println("Name: " + cat.getName() + " and age is " + cat.getAge() + " sound");
        cat.makeSound();
        System.out.println("Name: " + bird.getName() + " and age is " + bird.getAge() + " sound");
        bird.makeSound();
    }
}
