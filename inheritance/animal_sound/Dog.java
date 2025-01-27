package inheritance.animal_sound;

class Dog extends Animal {
    public Dog(String var1, int var2) {
       super(var1, var2);
    }
 
    public void makeSound() {
       System.out.println("Dog is barking");
    }
 }
 
